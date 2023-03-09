package Contrest;

import Contrest.Contrest;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Calca extends Roupa{
    
    private String cor;
    private boolean bolsos;
    private String detalhes;
    
    static Contrest contrest;
   
    public void cadastraCalca(int tipo, int quantidade, int tamanho, String fornecedor, String marca, String cr,boolean b, String d) {
        
        Calca c = new Calca();
        
        c.cadastraRoupa(tipo, quantidade, tamanho, fornecedor, marca);
        c.cor = cr;
        c.bolsos = b;
        c.detalhes = d;
        contrest.ListaCalca.add(c);
        JOptionPane.showMessageDialog(null, "Calca cadastrada com sucesso!" ,"Cadastro",1);
    }
    
    public void mostraCalca(JTable tabelaCalca, List<Calca> listaCalca){
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaCalca.getModel();
        dtm.setRowCount(listaCalca.size());
        tabelaCalca.setModel(dtm);
        int posLinha = 0;
        String bolso;

        for(Calca c : listaCalca){
            //"Código", "Marca", "Fornecedor", "Bolsos", "Cor", "Detalhes", "Quantidade
            tabelaCalca.setValueAt(c.getCod(), posLinha, 0);
            tabelaCalca.setValueAt(c.getMarca(), posLinha, 1);
            tabelaCalca.setValueAt(c.getFornecedor(), posLinha, 2);
            tabelaCalca.setValueAt(c.cor, posLinha, 3);
            if(c.bolsos)
               bolso = "Sim";
            else
                bolso = "Não";
            tabelaCalca.setValueAt(bolso, posLinha, 4);
            tabelaCalca.setValueAt(c.getTamanho(), posLinha, 5);
            tabelaCalca.setValueAt(c.detalhes, posLinha, 6);   
            tabelaCalca.setValueAt(c.getQnt(), posLinha, 7);
            posLinha++;
        }
    }
    
    public void excluiCalca(JTable tabelaCalca){
        if(tabelaCalca.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir", "Falha!", 0);
        }
        
        
        else{
            int confirmacao = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?", "Exclusão",JOptionPane.YES_NO_OPTION);
            if(confirmacao == JOptionPane.YES_OPTION) {
                contrest.ListaCalca.remove(tabelaCalca.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Calça excluída com sucesso!", "Excluir", 1);
            }
        }
    }
    
    public void venderCalca(int codigo, int x, List<Calca> listaCalca){
                int qnt, total, verifica = 0; 
        for(Calca c : listaCalca){
            if(c.getCod() == codigo){
                if(c.getQnt()>=x && c.getQnt()>0){
                    qnt = c.getQnt();
                    total = qnt - x;
                   c.setQnt(total);
                   contrest.ListaVendaCalca.add(c);
                   verifica = 1;
                   JOptionPane.showMessageDialog(null, "Calça vendida com sucesso!", "Sucesso", 1);
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
    
    public void mostraVendasCalca(JTable tabelaCalca, List<Calca> listaVendasCalca){
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaCalca.getModel();
        dtm.setRowCount(listaVendasCalca.size());
        tabelaCalca.setModel(dtm);
        int posLinha = 0;
        String bolso;

        for(Calca c : listaVendasCalca){
            //"Código", "Marca", "Fornecedor", "Bolsos", "Cor", "Detalhes", "Quantidade
            tabelaCalca.setValueAt(c.getCod(), posLinha, 0);
            tabelaCalca.setValueAt(c.getMarca(), posLinha, 1);
            tabelaCalca.setValueAt(c.getFornecedor(), posLinha, 2);
            tabelaCalca.setValueAt(c.cor, posLinha, 3);
            if(c.bolsos)
               bolso = "Sim";
            else
                bolso = "Não";
            tabelaCalca.setValueAt(bolso, posLinha, 4);
            tabelaCalca.setValueAt(c.getTamanho(), posLinha, 5);
            tabelaCalca.setValueAt(c.detalhes, posLinha, 6);  
            posLinha++;
        }
    }
}
