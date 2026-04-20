package Basics.BehaviouralPattern.CommandPattern.WithOutCommand;


class TextEditor{
    public void boldText(){
        System.out.println("Text has been bolded.");
    }
    public void italicText(){
        System.out.println("Text has been italicized.");
    }
    public void underLineText(){
        System.out.println("Text has been underlined.");
    }
}
class BoldButton{
    private TextEditor textEditor;
    public  BoldButton(TextEditor textEditor){
        this.textEditor=textEditor;
    }
    public void click(){
        textEditor.boldText();
    }
}
class ItallicButton{
    private TextEditor textEditor;
    public ItallicButton(TextEditor textEditor){
        this.textEditor=textEditor;
    }
    public void click(){
        textEditor.italicText();
    }
}
public class WithoutCommandPattern {
    static void main(String[] args) {
        TextEditor textEditor= new TextEditor();
        BoldButton boldButton =new BoldButton(textEditor);
        ItallicButton itallicButton= new ItallicButton(textEditor);
        boldButton.click();
        itallicButton.click();

    }
}
