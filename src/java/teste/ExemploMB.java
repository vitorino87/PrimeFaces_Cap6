/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploMB {

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }
    private List<Pessoa> pessoas;
    private Date data;
    //private MapModel localizacao = new DefaultMapModel();

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    /*
    @PostConstruct
    Um método anotodo dessa forma é chamado após a construção do objeto e após todas
    as injeções serem feitas, mas antes do objeto ser disponibilizado para operação.
    Assim, prefere-se iniciar os objetos dessa forma, pois todas as dependências já foram
    resolvidas e também porque há garantia de que esse método é chamado somente uma vez,
    o que não ocorre com o construtor, por causa do mecanismo de Proxy usado pelo CDI.
    
    @PreDestroy
    É análogo ao PostConstruct, com a exceção de ser invocado antes da instância ser
    destruída.
    
    Somente pode haver um método anotado com @PostConstruct e um com @PreDestroy.
    
    @PostConstruct: 1) o método anotado é invocado logo após a criação do objeto; 2) Todas
    as injeções já foram feitas; 3) Sempre usado para inicializar o bean, ao invés do construtor.
    
    @PreDestroy: 1) o método anotado é invocado antes da destruição.
    */
    @PostConstruct
    public void init(){
        pessoas = new ArrayList<Pessoa>();
        Pessoa p = new Pessoa();
        p.setEmail("tiago@tiago.com");
        p.setNome("Tiago");
        pessoas.add(p);
        p = new Pessoa();
        p.setEmail("vitorino@vitorino.com");
        p.setNome("Vitorino");
        pessoas.add(p);
        p = new Pessoa();
        p.setEmail("lucas@lucas.com");
        p.setNome("Lucas");
        pessoas.add(p);
        //localizacao=new DefaultMapModel();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    //public MapModel getLocalizacao() {
     //   return localizacao;
    //}

    //public void setLocalizacao(MapModel localizacao) {
       // this.localizacao = localizacao;
    //}

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
}
