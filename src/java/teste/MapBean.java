/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class MapBean {

    /**
     * Creates a new instance of MapBean
     */
    public MapBean() {
        model.addOverlay(new Marker(new LatLng(-23.645189, -46.528146), "M1"));
    }
    private MapModel model = new DefaultMapModel();

    public MapModel getModel() {
        return model;
    }
    
}
