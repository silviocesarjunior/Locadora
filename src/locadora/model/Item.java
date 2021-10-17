/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.Date;

/**
 *
 * @author Silvio César
 */
public class Item {
    private Integer codItem;
    private double preço;
    private String tipo;
    private Date datalocação;
    private Date dataDevolução;
    private Filme filme;
    private Cliente cliente;    
    
}
