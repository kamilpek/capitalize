package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import modifieres.CamelCaseStrategy;
import modifieres.CaseModifier;
import org.jetbrains.annotations.NotNull;

public class CamelCaseAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        CaseModifier caseModifier = new CaseModifier();
        caseModifier.modifyStringCase(new CamelCaseStrategy(), e);
    }
}
