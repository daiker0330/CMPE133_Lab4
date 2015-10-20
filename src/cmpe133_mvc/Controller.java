/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cmpe133_mvc;
import java.util.Stack;

/**
 *
 * @author yunfan
 */
public class Controller implements ControllerDelegation{
    private Model model;
    public void setModel(Model model){
        this.model = model;
    }
    
    private View view;
    public void setView(View view){
        this.view = view;
    }
    
    public void run(){
        view.setDataSource(this);
        view .setVisible(true);
    }
    
    public void saveNote(String note){
        model.saveNote(note);
    }
    
    public Stack<String> updateNote(){
        return model.getNotes();
    }
}
