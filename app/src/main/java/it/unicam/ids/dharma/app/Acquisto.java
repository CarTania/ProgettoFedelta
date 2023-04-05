package it.unicam.ids.dharma.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe rappresenta un acquisto effettuato da un cliente. E' composto da una lista di prodotti
 * acquistati in una data specifica.
 */
public class Acquisto {

    private final LocalDate dataAcquisto;

    private final List<Prodotto> listaProdotti;

    private final Cliente cliente;

    public Acquisto(LocalDate dataAcquisto, Cliente cliente) {
        this.dataAcquisto = dataAcquisto;
        this.cliente = cliente;
        this.listaProdotti= new ArrayList<>();
    }

    public boolean aggiungiProdotto(Prodotto prodotto)
    {
        return this.listaProdotti.add(prodotto);

    }

    public boolean rimuoviProdotto(Prodotto prodotto)
    {
        return this.listaProdotti.remove(prodotto);
    }


    public double totaleAcquisto()
    {
        double sum= 0;

        for (Prodotto p: listaProdotti)
        {
            sum+= p.getPrezzo();
        }
        return sum;
    }


    public LocalDate getDataAcquisto() {
        return dataAcquisto;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Acquisto{" +
                "dataAcquisto=" + dataAcquisto +
                ", listaProdotti=" + listaProdotti +
                ", cliente=" + cliente +
                '}';
    }
}
