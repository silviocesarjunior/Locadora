/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Silvio César
 */
public class Cliente {
    
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereço;
    private Date dtNascimento;
    private ArrayList<Item> itens = new ArrayList<Item>();   
         
}
