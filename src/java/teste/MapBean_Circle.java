/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.map.Circle;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class MapBean_Circle {

    /**
     * Creates a new instance of MapBean_Cicle
     */
    private MapModel model;
    public MapBean_Circle() {
        model = new DefaultMapModel();
        Circle circle = new Circle(new LatLng(-23.644656, -46.528205),200);
        circle.setFillColor("red");
        circle.setFillOpacity(0.1);
        model.addOverlay(circle);
    }

    public MapModel getModel() {
        return model;
    }
    
}
