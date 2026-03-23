package Basics.BehaviouralPattern.MementoPattern;

public class TextEditor {
    private String content;
    public void write(String text) {
        this.content = text;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    //Restore (Memento->update the state of current content)
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }


}
