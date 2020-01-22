package ExternalDsl.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Action_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Actuator_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new App_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new State_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new Action_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new State_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33f4L), MetaIdFactory.conceptId(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33d3L), MetaIdFactory.conceptId(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33d7L), MetaIdFactory.conceptId(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33d5L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33f4L), MetaIdFactory.conceptId(0x36b21cb1227440d2L, 0x9f74baf372272c13L, 0x2ddcf9c555fc33d5L)).seal();
}