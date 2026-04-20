package Basics.BehaviouralPattern.CommandPattern.With;


//command: Interface for executing operations
//Invoker: Sends the command
//Receiver:Perform the command

//command interface
interface  Command{
    void execute();
}

//concret class for command
class BoldCommand implements Command{
    TextEditorII editor;
    public BoldCommand(TextEditorII editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.boldText();
    }
}
class TextEditorII {
    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underlineText() {
        System.out.println("Text has been underlined.");
    }

    public void changeColor(){
        System.out.println("Text color has been changed");
    }
}

class ChangeColor implements Command{
    TextEditorII editor;
    public ChangeColor(TextEditorII editor){
        this.editor = editor;
    }
    @Override
    public void execute(){
        editor.changeColor();
    }
}
class ButtonI{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void click(){
        command.execute();
    }
}
public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditorII editorII = new TextEditorII();

        //Button
        // Decoupling -> One button can do many types of actions, decoupled from the text editor
        ButtonI button = new ButtonI();
        button.setCommand(new BoldCommand(editorII));
//        button.setCommand(new ChangeColor(editorII));
        button.click();
    }
}
