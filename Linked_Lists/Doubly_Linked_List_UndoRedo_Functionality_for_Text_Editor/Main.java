package Doubly_Linked_List_UndoRedo_Functionality_for_Text_Editor;

public class Main {
    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}