/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alvinmatias69
 */
public class Sewa1Minggu implements StrategiPenyewaan{

    @Override
    public double kalkulasiBiaya(long biaya) {
        return biaya * 0.65;
    }
    
}
