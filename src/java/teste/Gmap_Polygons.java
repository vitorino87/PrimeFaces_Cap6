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
import org.primefaces.model.map.Polygon;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class Gmap_Polygons {

    /**
     * Creates a new instance of Gmap_Polygons
     */
    private MapModel model;
    public Gmap_Polygons() {
        model = new DefaultMapModel();
        Polygon polygon = new Polygon();
        polygon.getPaths().add(new LatLng(-23.644710, -46.530526));
        polygon.getPaths().add(new LatLng(-23.643137, -46.529335));
        polygon.getPaths().add(new LatLng(-23.645014, -46.526149));
        polygon.getPaths().add(new LatLng(-23.646125, -46.527758));
        polygon.setFillColor("red");
        polygon.setFillOpacity(0.1);
        model.addOverlay(polygon);
    }

    public MapModel getModel() {
        return model;
    }
    
}
