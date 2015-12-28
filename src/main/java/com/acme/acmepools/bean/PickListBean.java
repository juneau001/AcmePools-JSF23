/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.acmepools.bean;

/**
 *
 * @author juneau
 */

import java.util.ArrayList;
import java.util.List;
import com.acme.acmepools.entity.ColumnModel;

import org.primefaces.model.DualListModel;

public class PickListBean {

    private DualListModel<ColumnBean> columns;

    private List<ColumnBean> source = null;
    private List<ColumnBean> target = null;


    public PickListBean(List<ColumnModel> columnModelList) {
        //Columns  
        source = new ArrayList<>();
        target = new ArrayList<>();
   
        columnModelList.stream().map((column) -> {
            System.out.println(column.getColumnLabel());
            return column;
        }).map((column) -> new ColumnBean(column.getId(), column.getColumnName(), column.getColumnLabel())).forEach((bean) -> {
            source.add(bean);
        });
        

        columns = new DualListModel<>(source, target);

    }

    public DualListModel<ColumnBean> getColumns() {
        return columns;
    }

    public void setColumns(DualListModel<ColumnBean> columns) {
        this.columns = columns;
    }

   
}
