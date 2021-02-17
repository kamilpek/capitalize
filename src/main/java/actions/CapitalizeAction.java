package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import modifieres.CapitalizeStrategy;
import modifieres.CaseModifier;
import org.jetbrains.annotations.NotNull;

public class CapitalizeAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        CaseModifier caseModifier = new CaseModifier();
        caseModifier.modifyStringCase(new CapitalizeStrategy(), e);
    }
}
