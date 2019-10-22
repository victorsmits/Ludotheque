/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.time.LocalDate;
/**
 *
 * @author ablo1
 */
public class Borrow {
    private LocalDate dateOfborrow;
    private LocalDate dateOfReturn;

    public Borrow(LocalDate dateOfborrow, LocalDate dateOfReturn) {
        this.dateOfborrow = dateOfborrow;
        this.dateOfReturn = dateOfReturn;
    }

    public LocalDate getDateOfborrow() {
        return dateOfborrow;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfborrow(LocalDate dateOfborrow) {
        this.dateOfborrow = dateOfborrow;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
    
}
