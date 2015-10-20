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
public interface ControllerDelegation {
    public void saveNote(String note);
    public Stack<String> updateNote();
}
