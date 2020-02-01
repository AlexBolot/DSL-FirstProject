package ExternalDsl.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenAspectBase;
import ExternalDsl.structure.LanguageConceptSwitch;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.text.rt.TextGenDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.text.rt.TextGenModelOutline;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;

public class TextGenAspectDescriptor extends TextGenAspectBase {
  private final LanguageConceptSwitch myIndex = new LanguageConceptSwitch();

  public TextGenAspectDescriptor() {
  }

  @Nullable
  @Override
  public TextGenDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    switch (myIndex.index(concept)) {
      case LanguageConceptSwitch.Action:
        return new Action_TextGen();
      case LanguageConceptSwitch.Actuator:
        return new Actuator_TextGen();
      case LanguageConceptSwitch.App:
        return new App_TextGen();
      case LanguageConceptSwitch.Condition:
        return new Condition_TextGen();
      case LanguageConceptSwitch.Sensor:
        return new Sensor_TextGen();
      case LanguageConceptSwitch.State:
        return new State_TextGen();
      case LanguageConceptSwitch.Transition:
        return new Transition_TextGen();
    }
    return null;
  }

  @Override
  public void breakdownToUnits(@NotNull TextGenModelOutline outline) {
    for (SNode root : outline.getModel().getRootNodes()) {
      if (root.getConcept().equals(CONCEPTS.App$vd)) {
        String fname = getFileName_App(root);
        String ext = getFileExtension_App(root);
        outline.registerTextUnit((ext == null ? fname : (fname + '.' + ext)), root);
        continue;
      }
    }
  }
  private static String getFileName_App(SNode node) {
    return SPropertyOperations.getString(node, PROPS.name$tAp1);
  }
  private static String getFileExtension_App(SNode node) {
    return "txt";
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept App$vd = MetaAdapterFactory.getConcept(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33d7L, "ExternalDsl.structure.App");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }
}
