/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.acmepools.jsf;

import java.time.LocalDate;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Juneau
 */
@Named(value = "testController")
@RequestScoped
public class TestController {

    private LocalDate todaysDate;
    private Date oldStyleDate;

    public TestController() {
        todaysDate = LocalDate.now();
        oldStyleDate = new Date();
    }

    /**
     * @return the todaysDate
     */
    public LocalDate getTodaysDate() {
        return todaysDate;
    }

    /**
     * @param todaysDate the todaysDate to set
     */
    public void setTodaysDate(LocalDate todaysDate) {
        this.todaysDate = todaysDate;
    }

    /**
     * @return the oldStyleDate
     */
    public Date getOldStyleDate() {
        return oldStyleDate;
    }

    /**
     * @param oldStyleDate the oldStyleDate to set
     */
    public void setOldStyleDate(Date oldStyleDate) {
        this.oldStyleDate = oldStyleDate;
    }

}
