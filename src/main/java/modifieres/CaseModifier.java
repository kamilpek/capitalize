package modifieres;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;

public class CaseModifier {
    public void modifyStringCase(Strategy strategy, AnActionEvent event) {
        final Project project = event.getProject();
        final Editor editor = event.getData(CommonDataKeys.EDITOR);
        final Document document = editor.getDocument();

        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();
        int start = primaryCaret.getSelectionStart();
        int end = primaryCaret.getSelectionEnd();

        String selectedText = primaryCaret.getSelectedText();
        final String changedCaseText = strategy.changeCase(selectedText);
        WriteCommandAction.runWriteCommandAction(project, () ->
                document.replaceString(start, end, changedCaseText)
        );

        primaryCaret.removeSelection();
    }
}
