package ExternalDsl.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Action = 0;
  public static final int Actuator = 1;
  public static final int App = 2;
  public static final int Sensor = 3;
  public static final int State = 4;
  public static final int Transition = 5;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x36b21cb1227440d2L, 0x9f74baf372272c13L);
    builder.put(0x2ddcf9c555fc33f4L, Action);
    builder.put(0x2ddcf9c555fc33d3L, Actuator);
    builder.put(0x2ddcf9c555fc33d7L, App);
    builder.put(0x2ddcf9c555fc33d4L, Sensor);
    builder.put(0x2ddcf9c555fc33d5L, State);
    builder.put(0x426e08eaa3624cfcL, Transition);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
