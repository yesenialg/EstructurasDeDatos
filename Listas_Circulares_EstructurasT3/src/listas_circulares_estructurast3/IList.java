/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_circulares_estructurast3;

/**
 *
 * @author HP
 */
public interface IList<T> {
    
    public boolean isEmpty();
    
    public boolean Exists(T d);
    
    public void addOrdered(T d)throws Exception;
    
    public void delete(T d)throws Exception;
    
    public void update(T dE, T dN)throws Exception;
    
    public String showList()throws Exception;
    
}
