package Contrest;

import Interface.Vender;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Camiseta extends Roupa{
    
    private String estampa;
    private String gola;
    private boolean manga;
    
    static Contrest contrest;
    
    public void cadastraCamiseta(int tipo, int quantidade, int tamanho, String fornecedor, String marca,
                                    String e, String g, boolean m){
        Camiseta camiseta = new Camiseta();
        camiseta.cadastraRoupa(tipo, quantidade, tamanho, fornecedor, marca);
        camiseta.estampa = e;
        camiseta.gola = g;
        camiseta.manga = m;
        contrest.ListaCamiseta.add(camiseta);
        JOptionPane.showMessageDialog(null, "Camiseta cadastrada com sucesso!" ,"Cadastro",1);
    }
    public void mostraCamiseta(JTable tabelaCamiseta, List<Camiseta> listaCamiseta){
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaCamiseta.getModel();
        dtm.setRowCount(listaCamiseta.size());
        tabelaCamiseta.setModel(dtm);
        int posLinha = 0;
        String mangas;

        for(Camiseta camiseta : listaCamiseta){
            //"Código", "Marca", "Fornecedor", "Gola", "Manga", "Estampa", "Quantidade"
            tabelaCamiseta.setValueAt(camiseta.getCod(), posLinha, 0);
            tabelaCamiseta.setValueAt(camiseta.getMarca(), posLinha, 1);
            tabelaCamiseta.setValueAt(camiseta.getFornecedor(), posLinha, 2);
            tabelaCamiseta.setValueAt(camiseta.gola, posLinha, 3);
            if(camiseta.manga)
               mangas = "Sim";
            else
                mangas = "Não";
            tabelaCamiseta.setValueAt(mangas, posLinha, 4);
            tabelaCamiseta.setValueAt(camiseta.getTamanho(), posLinha, 5);
            tabelaCamiseta.setValueAt(camiseta.estampa, posLinha, 6);   
            tabelaCamiseta.setValueAt(camiseta.getQnt(), posLinha, 7);
            posLinha++;
        }
    }
    
    public void excluiCamiseta(JTable tabelaCamiseta){
        if(tabelaCamiseta.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir", "Falha!", 0);
        }
        
        
        else{
            int confirmacao = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?", "Exclusão",JOptionPane.YES_NO_OPTION);
            if(confirmacao == JOptionPane.YES_OPTION) {
                contrest.ListaCamiseta.remove(tabelaCamiseta.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Camiseta excluída com sucesso!", "Excluir", 1);
                
            }
        }
    }
    
    public void venderCamiseta(int codigo, int x, List<Camiseta> listaCamiseta){
                int qnt, total, verifica=0;
        for(Camiseta c : listaCamiseta){
            if(c.getCod() == codigo){
                if(c.getQnt()>=x && c.getQnt()>0){
                     qnt = getQnt();
                     total = qnt - x;
                   c.setQnt(total);
                   contrest.ListaVendaCamiseta.add(c);
                   verifica=1;
                   JOptionPane.showMessageDialog(null, "Camiseta vendida com sucesso!", "Sucesso", 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sem estoque!", "Falha", 0);
                }
            }
        }
        if(verifica!=1){
            JOptionPane.showMessageDialog(null, "Item não encontrado!", "Falha", 0);
        }
    }
    
    public void mostraVendasCamiseta(JTable tabelaCamiseta, List<Camiseta> listaVendasCamiseta){
        DefaultTableModel dtm = (DefaultTableModel) tabelaCamiseta.getModel();
        dtm.setRowCount(listaVendasCamiseta.size());
        tabelaCamiseta.setModel(dtm);
        int posLinha = 0;
        String mangas;

        for(Camiseta camiseta : listaVendasCamiseta){
            //"Código", "Marca", "Fornecedor", "Gola", "Manga", "Estampa", "Quantidade"
            tabelaCamiseta.setValueAt(camiseta.getCod(), posLinha, 0);
            tabelaCamiseta.setValueAt(camiseta.getMarca(), posLinha, 1);
            tabelaCamiseta.setValueAt(camiseta.getFornecedor(), posLinha, 2);
            tabelaCamiseta.setValueAt(camiseta.gola, posLinha, 3);
            if(camiseta.manga)
               mangas = "Sim";
            else
                mangas = "Não";
            tabelaCamiseta.setValueAt(mangas, posLinha, 4);
            tabelaCamiseta.setValueAt(camiseta.getTamanho(), posLinha, 5);
            tabelaCamiseta.setValueAt(camiseta.estampa, posLinha, 6);
            posLinha++;
        }
    }
    
    
}
