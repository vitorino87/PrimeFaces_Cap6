/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class PickListBean {

    /**
     * Creates a new instance of PickListBean
     */
    public PickListBean() {
    }
    private DualListModel<String> cities;
    @PostConstruct
    public void init(){
        List<String> source = new ArrayList<String>();
        List<String> target = new ArrayList<String>();
        source.add("Instanbul");
        source.add("Ankara");
        source.add("Izmir");
        source.add("Antalya");
        source.add("Bursa");
        cities = new DualListModel<String>(source,target);
    }

    public DualListModel<String> getCities() {
        return cities;
    }

    public void setCities(DualListModel<String> cities) {
        this.cities = cities;
    }
    
}
