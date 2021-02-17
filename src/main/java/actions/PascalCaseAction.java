package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import modifieres.CaseModifier;
import modifieres.PascalCaseStrategy;
import org.jetbrains.annotations.NotNull;

public class PascalCaseAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        CaseModifier caseModifier = new CaseModifier();
        caseModifier.modifyStringCase(new PascalCaseStrategy(), e);
    }
}
