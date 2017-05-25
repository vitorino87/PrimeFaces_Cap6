/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Polyline;
import org.primefaces.model.map.LatLng;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class MapBean_Polylines {

    /**
     * Creates a new instance of MapBean2
     */
    private MapModel model;
    public MapBean_Polylines() {
        model=new DefaultMapModel();
        Polyline polyline = new Polyline();
        polyline.getPaths().add(new LatLng(-23.644710, -46.530526));
        polyline.getPaths().add(new LatLng(-23.643137, -46.529335));
        polyline.getPaths().add(new LatLng(-23.645014, -46.526149));
        polyline.getPaths().add(new LatLng(-23.646125, -46.527758));
        polyline.setStrokeColor("red");
        model.addOverlay(polyline);
    }

    public MapModel getModel() {
        return model;
    }
    
}
