package es.ulpgc.eite.cleancode.advclickcounter.data;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CounterData implements BaseData {

  // put the view state here
  public Long id;
  public Integer value;
  public List<ClickData> clicks;

  public CounterData() {
    id = generateUniqueId();
    value = 0;
    clicks= new ArrayList<>();
  }

  @Override
  public Integer getValue() {
    return value;
  }

  /**
   * Genereate unique ID from UUID in positive space
   * Reference: http://www.gregbugaj.com/?p=587
   *
   * @return long value representing UUID
   */
  private Long generateUniqueId() {
    long val = -1;

    do {

      final UUID uid = UUID.randomUUID();
      final ByteBuffer buffer = ByteBuffer.wrap(new byte[16]);
      buffer.putLong(uid.getLeastSignificantBits());
      buffer.putLong(uid.getMostSignificantBits());
      final BigInteger bi = new BigInteger(buffer.array());
      val = bi.longValue();
    }

    // We also make sure that the ID is in positive space,
    // if its not we simply repeat the process
    while (val < 0);
    return val;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CounterData)) return false;
    CounterData data = (CounterData) obj;
    return Objects.equals(id, data.id);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
