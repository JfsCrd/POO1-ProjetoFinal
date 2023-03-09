package Interface;

import Contrest.Calca;
import Contrest.Camiseta;
import Contrest.Contrest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Func_Menu extends javax.swing.JFrame {

    static Contrest contrest;
    
    Camiseta camiseta = new Camiseta();
    Calca calca = new Calca();
    
    int tamanho;
    boolean bolsos;
    boolean mangas;
    String gola;
    int tipo;
    
    public Func_Menu() {
        initComponents();
        
        tabela_busca_calca.setVisible(false);
        tabela_busca_camiseta.setVisible(false);
        
        calca.mostraCalca(tabela_calca, contrest.ListaCalca);
        camiseta.mostraCamiseta(tabela_camiseta, contrest.ListaCamiseta);
        
        
        P_Principal.setVisible(true);
        P_Alterar.setVisible(false);
        P_Buscar.setVisible(false);
        P_Cadastrar.setVisible(false);
        P_Excluir.setVisible(false); 
        P_Listar.setVisible(false);
        P_Vender.setVisible(false);
    }
    
    public void fechaPanels(){
        P_Principal.setVisible(false);
        P_Alterar.setVisible(false);
        P_Buscar.setVisible(false);
        P_Cadastrar.setVisible(false);
        P_Excluir.setVisible(false); 
        P_Listar.setVisible(false);
        P_Vender.setVisible(false);
    }
    
    public void fechaAlterar(){
        panel_alterar_principal.setVisible(false);
        panel_alterar_calca.setVisible(false);
        panel_alterar_camiseta.setVisible(false);
    }
    
    public void fechaBuscar(){
        P_Calca.setVisible(false);
        P_Camiseta.setVisible(false);
        p_buscar_principal.setVisible(false);
    }
    
    public void fechaCadastrar(){
        P_Cadastro_Principal.setVisible(false);
        P_Cadastrar_Calca.setVisible(false);
        P_Cadastrar_Camiseta.setVisible(false);
    }
    
    public void fechaExcluir(){
        panel_excluir_principal.setVisible(false);
        panel_excluir_camiseta.setVisible(false);
        panel_excluir_calca.setVisible(false);  
    }
    
    public void fechaVender(){
        panel_vender_principal.setVisible(false);
        panel_v_calca.setVisible(false);
        panel_v_camiseta.setVisible(false);
        panel_textos.setVisible(false);
        c_vender_qnt.setText(null);
        c_vender_codigo.setText(null);
    }
    
    public void fechaVendas(){
        panel_vendas_principal.setVisible(false);
        p_vendas_camiseta.setVisible(false);
        p_vendas_calca.setVisible(false);
    }
    
    
    public void limpaCampos(){
        c_bolsos_calca.setSelectedItem(null);
        c_gola_camiseta.setSelectedItem(null);
        c_camiseta_mangas.setSelectedItem(null);
        c_cor_calca.setText(null);
        c_detalhes_calca.setText(null);
        c_estampa_camiseta.setText(null);
        c_fornecedor_calca.setText(null);
        c_fornecedor_camiseta.setText(null);
        c_marca_calca.setText(null);
        c_marca_camiseta.setText(null);
        c_qnt_camiseta.setText(null);
        c_qnt_calca.setText(null);
        c_tamanho_calca.setText(null);
        c_tamanho_camiseta.setText(null);
    }
    
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Título = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        B_Alterar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        B_Buscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        B_Vender = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        B_listar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        B_Cadastrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        B_Excluir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Submenu = new javax.swing.JPanel();
        Paineis = new javax.swing.JDesktopPane();
        P_Alterar = new javax.swing.JDesktopPane();
        b_alterar_salvar = new javax.swing.JButton();
        c_alterar_tipo = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel_alterar_principal = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        panel_alterar_calca = new javax.swing.JDesktopPane();
        tabela_a_calca = new javax.swing.JScrollPane();
        t_a_calca = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        c_calca_novo_marca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        c_calca_novo_fornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        c_calca_novo_cor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        c_calca_novo_bolsos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        c_calca_novo_tamanho = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        c_calca_novo_quantidade = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        c_calca_novo_detalhes = new javax.swing.JTextField();
        panel_alterar_camiseta = new javax.swing.JDesktopPane();
        tabela_a_camiseta = new javax.swing.JScrollPane();
        t_a_camiseta = new javax.swing.JTable();
        c_camiseta_novo_marca = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        c_camiseta_novo_fornecedor = new javax.swing.JTextField();
        c_camiseta_novo_tamanho = new javax.swing.JTextField();
        c_camiseta_novo_quantidade = new javax.swing.JTextField();
        c_camiseta_novo_estampa = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        c_camiseta_novo_gola = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        c_camiseta_novo_mangas = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        P_Buscar = new javax.swing.JDesktopPane();
        selecao_busca = new javax.swing.JComboBox<>();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        P_Calca = new javax.swing.JDesktopPane();
        tabela_busca_calca = new javax.swing.JScrollPane();
        tabela_calca = new javax.swing.JTable();
        P_Camiseta = new javax.swing.JDesktopPane();
        tabela_busca_camiseta = new javax.swing.JScrollPane();
        tabela_camiseta = new javax.swing.JTable();
        p_buscar_principal = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        P_Cadastrar = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        P_Cadastro_Principal = new javax.swing.JDesktopPane();
        jLabel34 = new javax.swing.JLabel();
        P_Cadastrar_Camiseta = new javax.swing.JDesktopPane();
        jLabel18 = new javax.swing.JLabel();
        c_marca_camiseta = new javax.swing.JTextField();
        c_fornecedor_camiseta = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        c_gola_camiseta = new javax.swing.JComboBox<>();
        c_camiseta_mangas = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        c_qnt_camiseta = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        c_estampa_camiseta = new javax.swing.JTextField();
        b_Camiseta_Salvar = new javax.swing.JButton();
        c_tamanho_camiseta = new javax.swing.JTextField();
        P_Cadastrar_Calca = new javax.swing.JDesktopPane();
        jLabel63 = new javax.swing.JLabel();
        c_marca_calca = new javax.swing.JTextField();
        c_fornecedor_calca = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        c_cor_calca = new javax.swing.JTextField();
        c_bolsos_calca = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        c_qnt_calca = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        c_detalhes_calca = new javax.swing.JTextField();
        c_tamanho_calca = new javax.swing.JTextField();
        campo_tipo = new javax.swing.JComboBox<>();
        b_Salvar_Calca = new javax.swing.JButton();
        P_Excluir = new javax.swing.JDesktopPane();
        jPanel7 = new javax.swing.JPanel();
        panel_excluir_camiseta = new javax.swing.JDesktopPane();
        tabela_excluir_camiseta = new javax.swing.JScrollPane();
        tabela_e_camiseta = new javax.swing.JTable();
        panel_excluir_calca = new javax.swing.JDesktopPane();
        tabela_exclui_calca = new javax.swing.JScrollPane();
        tabela_e_calca = new javax.swing.JTable();
        panel_excluir_principal = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        c_excluir_item = new javax.swing.JComboBox<>();
        b_Confirma_excluir = new javax.swing.JButton();
        P_Listar = new javax.swing.JDesktopPane();
        c_selecao_listar = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        p_vendas_camiseta = new javax.swing.JPanel();
        tabela_vendas_camiseta = new javax.swing.JScrollPane();
        t_vendas_camiseta = new javax.swing.JTable();
        p_vendas_calca = new javax.swing.JPanel();
        tabela_vendas_calca = new javax.swing.JScrollPane();
        t_vendas_calca = new javax.swing.JTable();
        panel_vendas_principal = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        P_Vender = new javax.swing.JDesktopPane();
        jPanel6 = new javax.swing.JPanel();
        panel_vender_principal = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        panel_v_calca = new javax.swing.JPanel();
        tabela_v_calca = new javax.swing.JScrollPane();
        tabela_vender_calca = new javax.swing.JTable();
        panel_v_camiseta = new javax.swing.JPanel();
        tabela_v_camiseta = new javax.swing.JScrollPane();
        tabela_vender_camiseta = new javax.swing.JTable();
        c_selecao_vender = new javax.swing.JComboBox<>();
        b_vender = new javax.swing.JButton();
        panel_textos = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        c_vender_qnt = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        c_vender_codigo = new javax.swing.JTextField();
        P_Principal = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTREST | Menu ");

        Título.setBackground(new java.awt.Color(59, 75, 89));

        jLabel9.setFont(new java.awt.Font("A25-SQUANOVA", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 163, 94));
        jLabel9.setText("  COntrest");

        jLabel10.setFont(new java.awt.Font("Sansumi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 163, 77));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Menu do Funcionário");

        javax.swing.GroupLayout TítuloLayout = new javax.swing.GroupLayout(Título);
        Título.setLayout(TítuloLayout);
        TítuloLayout.setHorizontalGroup(
            TítuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TítuloLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        TítuloLayout.setVerticalGroup(
            TítuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TítuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        B_Alterar.setBackground(new java.awt.Color(242, 223, 213));
        B_Alterar.setPreferredSize(new java.awt.Dimension(195, 70));
        B_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AlterarMouseClicked(evt);
            }
        });
        B_Alterar.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        B_Alterar.add(jLabel1, "card2");

        B_Buscar.setBackground(new java.awt.Color(245, 162, 139));
        B_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_BuscarMouseClicked(evt);
            }
        });
        B_Buscar.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        B_Buscar.add(jLabel2, "card2");

        B_Vender.setBackground(new java.awt.Color(113, 137, 129));
        B_Vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VenderMouseClicked(evt);
            }
        });
        B_Vender.setLayout(new java.awt.CardLayout());

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vender");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        B_Vender.add(jLabel6, "card2");

        B_listar.setBackground(new java.awt.Color(115, 104, 103));
        B_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_listarMouseClicked(evt);
            }
        });
        B_listar.setLayout(new java.awt.CardLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vendas");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        B_listar.add(jLabel5, "card2");

        B_Cadastrar.setBackground(new java.awt.Color(216, 137, 130));
        B_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CadastrarMouseClicked(evt);
            }
        });
        B_Cadastrar.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastrar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        B_Cadastrar.add(jLabel3, "card2");

        B_Excluir.setBackground(new java.awt.Color(157, 121, 115));
        B_Excluir.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                B_ExcluirAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        B_Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ExcluirMouseClicked(evt);
            }
        });
        B_Excluir.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Excluir");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        B_Excluir.add(jLabel4, "card2");

        javax.swing.GroupLayout SubmenuLayout = new javax.swing.GroupLayout(Submenu);
        Submenu.setLayout(SubmenuLayout);
        SubmenuLayout.setHorizontalGroup(
            SubmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        SubmenuLayout.setVerticalGroup(
            SubmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        Paineis.setBackground(new java.awt.Color(242, 223, 213));
        Paineis.setLayout(new java.awt.CardLayout());

        P_Alterar.setBackground(new java.awt.Color(242, 223, 213));

        b_alterar_salvar.setText("Salvar");

        c_alterar_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Calça", "Camiseta" }));
        c_alterar_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c_alterar_tipoItemStateChanged(evt);
            }
        });
        c_alterar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_alterar_tipoActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(242, 223, 213));
        jDesktopPane1.setLayout(new java.awt.CardLayout());

        panel_alterar_principal.setBackground(new java.awt.Color(242, 223, 213));

        jLabel8.setText("Selecione o tipo de item acima!");

        panel_alterar_principal.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_alterar_principalLayout = new javax.swing.GroupLayout(panel_alterar_principal);
        panel_alterar_principal.setLayout(panel_alterar_principalLayout);
        panel_alterar_principalLayout.setHorizontalGroup(
            panel_alterar_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alterar_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        panel_alterar_principalLayout.setVerticalGroup(
            panel_alterar_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alterar_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jDesktopPane1.add(panel_alterar_principal, "panel_alterar_principal");
        panel_alterar_principal.getAccessibleContext().setAccessibleName("panel_alterar_principal");
        panel_alterar_principal.getAccessibleContext().setAccessibleDescription("");

        panel_alterar_calca.setBackground(new java.awt.Color(242, 223, 213));

        t_a_calca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Cor", "Bolsos", "Detalhes", "Tamanho", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_a_calca.setViewportView(t_a_calca);
        t_a_calca.getAccessibleContext().setAccessibleName("t_a_calca");

        jLabel11.setText("Marca");

        jLabel12.setText("Fornecedor");

        jLabel14.setText("Cor");

        c_calca_novo_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_calca_novo_corActionPerformed(evt);
            }
        });

        jLabel15.setText("Bolsos");

        c_calca_novo_bolsos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        jLabel16.setText("Tamanho");

        jLabel17.setText("Quantidade");

        jLabel32.setText("Detalhes");

        c_calca_novo_detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_calca_novo_detalhesActionPerformed(evt);
            }
        });

        panel_alterar_calca.setLayer(tabela_a_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_marca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_fornecedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_cor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_bolsos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_tamanho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_quantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_calca.setLayer(c_calca_novo_detalhes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_alterar_calcaLayout = new javax.swing.GroupLayout(panel_alterar_calca);
        panel_alterar_calca.setLayout(panel_alterar_calcaLayout);
        panel_alterar_calcaLayout.setHorizontalGroup(
            panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabela_a_calca)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_alterar_calcaLayout.createSequentialGroup()
                .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                            .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                                    .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                                    .addComponent(c_calca_novo_cor)
                                    .addGap(33, 33, 33)))
                            .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(c_calca_novo_bolsos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(c_calca_novo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(231, Short.MAX_VALUE))
                    .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                        .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(c_calca_novo_tamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel17))
                            .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(c_calca_novo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(c_calca_novo_fornecedor)))
            .addComponent(c_calca_novo_detalhes)
        );
        panel_alterar_calcaLayout.setVerticalGroup(
            panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alterar_calcaLayout.createSequentialGroup()
                .addComponent(tabela_a_calca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_calca_novo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_calca_novo_fornecedor))
                .addGap(18, 18, 18)
                .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_alterar_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_calca_novo_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_calca_novo_bolsos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_calca_novo_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_calca_novo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_calca_novo_detalhes, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabela_a_calca.getAccessibleContext().setAccessibleName("tabela_a_calca");

        jDesktopPane1.add(panel_alterar_calca, "panel_alterar_calca");
        panel_alterar_calca.getAccessibleContext().setAccessibleName("panel_alterar_calca");

        panel_alterar_camiseta.setBackground(new java.awt.Color(242, 223, 213));

        t_a_camiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Gola", "Mangas", "Tamanho", "Estampa", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_a_camiseta.setViewportView(t_a_camiseta);
        t_a_camiseta.getAccessibleContext().setAccessibleName("t_a_camiseta");

        jLabel33.setText("Marca");

        jLabel38.setText("Fornecedor");

        c_camiseta_novo_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_camiseta_novo_fornecedorActionPerformed(evt);
            }
        });

        c_camiseta_novo_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_camiseta_novo_tamanhoActionPerformed(evt);
            }
        });

        c_camiseta_novo_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_camiseta_novo_quantidadeActionPerformed(evt);
            }
        });

        c_camiseta_novo_estampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_camiseta_novo_estampaActionPerformed(evt);
            }
        });

        jLabel39.setText("Estampa");

        jLabel40.setText("Gola");

        c_camiseta_novo_gola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        jLabel41.setText("Mangas");

        c_camiseta_novo_mangas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        jLabel42.setText("Tamamho");

        jLabel43.setText("Quantidade");

        panel_alterar_camiseta.setLayer(tabela_a_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_marca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_fornecedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_tamanho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_quantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_estampa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_gola, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(c_camiseta_novo_mangas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_alterar_camiseta.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_alterar_camisetaLayout = new javax.swing.GroupLayout(panel_alterar_camiseta);
        panel_alterar_camiseta.setLayout(panel_alterar_camisetaLayout);
        panel_alterar_camisetaLayout.setHorizontalGroup(
            panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabela_a_camiseta)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_alterar_camisetaLayout.createSequentialGroup()
                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_alterar_camisetaLayout.createSequentialGroup()
                        .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_camiseta_novo_gola, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_alterar_camisetaLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(80, 80, 80))
                            .addComponent(c_camiseta_novo_mangas, 0, 125, Short.MAX_VALUE)))
                    .addComponent(jLabel33)
                    .addComponent(c_camiseta_novo_marca))
                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_alterar_camisetaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_alterar_camisetaLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_alterar_camisetaLayout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(0, 91, Short.MAX_VALUE))
                                    .addComponent(c_camiseta_novo_tamanho))
                                .addGap(18, 18, 18)
                                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_camiseta_novo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_alterar_camisetaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel38)
                                .addGap(212, 212, 212))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_alterar_camisetaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c_camiseta_novo_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(c_camiseta_novo_estampa)
        );
        panel_alterar_camisetaLayout.setVerticalGroup(
            panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alterar_camisetaLayout.createSequentialGroup()
                .addComponent(tabela_a_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_camiseta_novo_marca)
                    .addComponent(c_camiseta_novo_fornecedor))
                .addGap(18, 18, 18)
                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_alterar_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_camiseta_novo_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_camiseta_novo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_camiseta_novo_gola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_camiseta_novo_mangas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_camiseta_novo_estampa, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabela_a_camiseta.getAccessibleContext().setAccessibleName("tabela_a_camiseta");

        jDesktopPane1.add(panel_alterar_camiseta, "panel_alterar_camiseta");
        panel_alterar_camiseta.getAccessibleContext().setAccessibleName("panel_alterar_camiseta");

        P_Alterar.setLayer(b_alterar_salvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Alterar.setLayer(c_alterar_tipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Alterar.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_AlterarLayout = new javax.swing.GroupLayout(P_Alterar);
        P_Alterar.setLayout(P_AlterarLayout);
        P_AlterarLayout.setHorizontalGroup(
            P_AlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_AlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AlterarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_alterar_salvar))
                    .addComponent(jDesktopPane1)
                    .addComponent(c_alterar_tipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_AlterarLayout.setVerticalGroup(
            P_AlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_alterar_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_alterar_salvar)
                .addGap(11, 11, 11))
        );

        Paineis.add(P_Alterar, "P_Alterar");
        P_Alterar.getAccessibleContext().setAccessibleName("P_Alterar");
        P_Alterar.getAccessibleContext().setAccessibleDescription("");

        P_Buscar.setBackground(new java.awt.Color(245, 162, 139));

        selecao_busca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Selecione", "Camiseta", "Calça"}));
        selecao_busca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecao_buscaItemStateChanged(evt);
            }
        });
        selecao_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecao_buscaActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayout(new java.awt.CardLayout());

        P_Calca.setBackground(new java.awt.Color(245, 162, 139));
        P_Calca.setLayout(new java.awt.CardLayout());

        tabela_busca_calca.setForeground(new java.awt.Color(245, 162, 139));

        tabela_calca.setBackground(new java.awt.Color(245, 162, 139));
        tabela_calca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Cor", "Bolsos", "Tamanho", "Detalhes", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_calca.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabela_busca_calca.setViewportView(tabela_calca);

        P_Calca.add(tabela_busca_calca, "card2");
        tabela_busca_calca.getAccessibleContext().setAccessibleName("tabela_busca_calca");

        jDesktopPane2.add(P_Calca, "P_Calca");
        P_Calca.getAccessibleContext().setAccessibleName("P_Calca");

        P_Camiseta.setBackground(new java.awt.Color(245, 162, 139));
        P_Camiseta.setLayout(new java.awt.CardLayout());

        tabela_camiseta.setBackground(new java.awt.Color(245, 162, 139));
        tabela_camiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Gola", "Manga", "Estampa", "Tamanho", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_camiseta.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabela_busca_camiseta.setViewportView(tabela_camiseta);

        P_Camiseta.add(tabela_busca_camiseta, "card2");
        tabela_busca_camiseta.getAccessibleContext().setAccessibleName("tabela_busca_camiseta");
        tabela_busca_camiseta.getAccessibleContext().setAccessibleDescription("");

        jDesktopPane2.add(P_Camiseta, "P_Camiseta");
        P_Camiseta.getAccessibleContext().setAccessibleName("P_Camiseta");

        p_buscar_principal.setBackground(new java.awt.Color(245, 162, 139));

        jLabel31.setText("Selecione o tipo!");

        javax.swing.GroupLayout p_buscar_principalLayout = new javax.swing.GroupLayout(p_buscar_principal);
        p_buscar_principal.setLayout(p_buscar_principalLayout);
        p_buscar_principalLayout.setHorizontalGroup(
            p_buscar_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_buscar_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_buscar_principalLayout.setVerticalGroup(
            p_buscar_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_buscar_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jDesktopPane2.add(p_buscar_principal, "p_buscar_principal");
        p_buscar_principal.getAccessibleContext().setAccessibleName("p_buscar_principal");

        P_Buscar.setLayer(selecao_busca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Buscar.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_BuscarLayout = new javax.swing.GroupLayout(P_Buscar);
        P_Buscar.setLayout(P_BuscarLayout);
        P_BuscarLayout.setHorizontalGroup(
            P_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecao_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(P_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_BuscarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        P_BuscarLayout.setVerticalGroup(
            P_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_BuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecao_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
            .addGroup(P_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_BuscarLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jDesktopPane2.getAccessibleContext().setAccessibleName("");

        Paineis.add(P_Buscar, "P_Buscar");
        P_Buscar.getAccessibleContext().setAccessibleName("P_Buscar");

        P_Cadastrar.setBackground(new java.awt.Color(216, 137, 130));

        jPanel1.setLayout(new java.awt.CardLayout());

        P_Cadastro_Principal.setBackground(new java.awt.Color(216, 137, 130));

        jLabel34.setText("Selecione a opção acima");

        P_Cadastro_Principal.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_Cadastro_PrincipalLayout = new javax.swing.GroupLayout(P_Cadastro_Principal);
        P_Cadastro_Principal.setLayout(P_Cadastro_PrincipalLayout);
        P_Cadastro_PrincipalLayout.setHorizontalGroup(
            P_Cadastro_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Cadastro_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        P_Cadastro_PrincipalLayout.setVerticalGroup(
            P_Cadastro_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Cadastro_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(P_Cadastro_Principal, "P_Cadastro_Principal");
        P_Cadastro_Principal.getAccessibleContext().setAccessibleName("P_Cadastro_Principal");

        P_Cadastrar_Camiseta.setBackground(new java.awt.Color(216, 137, 130));

        jLabel18.setText("Marca");

        jLabel20.setText("Fornecedor");

        jLabel21.setText("Gola");

        c_gola_camiseta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Careca", "Redonda"}));
        c_gola_camiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_gola_camisetaActionPerformed(evt);
            }
        });

        c_camiseta_mangas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        jLabel22.setText("Mangas");

        jLabel23.setText("Tamanho");

        jLabel25.setText("Quantidade");

        jLabel35.setText("Estampa");

        b_Camiseta_Salvar.setText("Salvar");
        b_Camiseta_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Camiseta_SalvarActionPerformed(evt);
            }
        });

        P_Cadastrar_Camiseta.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_marca_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_fornecedor_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_gola_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_camiseta_mangas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_qnt_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_estampa_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(b_Camiseta_Salvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Camiseta.setLayer(c_tamanho_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_Cadastrar_CamisetaLayout = new javax.swing.GroupLayout(P_Cadastrar_Camiseta);
        P_Cadastrar_Camiseta.setLayout(P_Cadastrar_CamisetaLayout);
        P_Cadastrar_CamisetaLayout.setHorizontalGroup(
            P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(534, 534, 534))
            .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                        .addComponent(c_gola_camiseta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(c_camiseta_mangas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(231, 231, 231))
                    .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addComponent(c_marca_camiseta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45)
                .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_Cadastrar_CamisetaLayout.createSequentialGroup()
                        .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(110, 110, 110))
                            .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                                .addComponent(c_tamanho_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addComponent(c_qnt_camiseta)))
                    .addComponent(c_fornecedor_camiseta)))
            .addComponent(c_estampa_camiseta)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_Cadastrar_CamisetaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b_Camiseta_Salvar))
        );
        P_Cadastrar_CamisetaLayout.setVerticalGroup(
            P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Cadastrar_CamisetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_marca_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_fornecedor_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Cadastrar_CamisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_gola_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_camiseta_mangas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_qnt_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_tamanho_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_estampa_camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(b_Camiseta_Salvar)
                .addContainerGap())
        );

        jPanel1.add(P_Cadastrar_Camiseta, "P_Cadastrar_Camiseta");
        P_Cadastrar_Camiseta.getAccessibleContext().setAccessibleName("P_Cadastrar_Camiseta");

        P_Cadastrar_Calca.setBackground(new java.awt.Color(216, 137, 130));
        P_Cadastrar_Calca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_Cadastrar_CalcaMouseClicked(evt);
            }
        });

        jLabel63.setText("Marca");

        jLabel19.setText("Fornecedor");

        jLabel26.setText("Cor");

        c_bolsos_calca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        jLabel27.setText("Bolsos");

        jLabel28.setText("Tamanho");

        jLabel29.setText("Quantidade");

        jLabel30.setText("Detalhes");

        P_Cadastrar_Calca.setLayer(jLabel63, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_marca_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_fornecedor_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_cor_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_bolsos_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_qnt_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_detalhes_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar_Calca.setLayer(c_tamanho_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_Cadastrar_CalcaLayout = new javax.swing.GroupLayout(P_Cadastrar_Calca);
        P_Cadastrar_Calca.setLayout(P_Cadastrar_CalcaLayout);
        P_Cadastrar_CalcaLayout.setHorizontalGroup(
            P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(533, 533, 533))
            .addComponent(c_detalhes_calca)
            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                        .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_marca_calca)
                            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                        .addComponent(c_cor_calca)
                                        .addGap(60, 60, 60))
                                    .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(132, 132, 132)))
                                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(81, 81, 81))
                                    .addComponent(c_bolsos_calca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(45, 45, 45))
                    .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276)))
                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_fornecedor_calca)
                    .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_Cadastrar_CalcaLayout.createSequentialGroup()
                        .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85))
                            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                .addComponent(c_tamanho_calca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50))
                            .addComponent(c_qnt_calca)))))
        );
        P_Cadastrar_CalcaLayout.setVerticalGroup(
            P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Cadastrar_CalcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_marca_calca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_fornecedor_calca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Cadastrar_CalcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cor_calca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_bolsos_calca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_qnt_calca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_tamanho_calca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_detalhes_calca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel1.add(P_Cadastrar_Calca, "P_Cadastrar_Calca");
        P_Cadastrar_Calca.getAccessibleContext().setAccessibleName("P_Cadastrar_Calca");

        campo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo", "Calça", "Camiseta"}));
        campo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_tipoActionPerformed(evt);
            }
        });

        b_Salvar_Calca.setText("Salvar");
        b_Salvar_Calca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Salvar_CalcaActionPerformed(evt);
            }
        });

        P_Cadastrar.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar.setLayer(campo_tipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Cadastrar.setLayer(b_Salvar_Calca, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_CadastrarLayout = new javax.swing.GroupLayout(P_Cadastrar);
        P_Cadastrar.setLayout(P_CadastrarLayout);
        P_CadastrarLayout.setHorizontalGroup(
            P_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_CadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_tipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_CadastrarLayout.createSequentialGroup()
                        .addGap(0, 542, Short.MAX_VALUE)
                        .addComponent(b_Salvar_Calca)))
                .addContainerGap())
            .addGroup(P_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P_CadastrarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        P_CadastrarLayout.setVerticalGroup(
            P_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_CadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(b_Salvar_Calca)
                .addGap(22, 22, 22))
            .addGroup(P_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P_CadastrarLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        Paineis.add(P_Cadastrar, "P_Cadastrar");
        P_Cadastrar.getAccessibleContext().setAccessibleName("P_Cadastrar");

        P_Excluir.setBackground(new java.awt.Color(157, 121, 115));
        P_Excluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                P_ExcluirKeyPressed(evt);
            }
        });

        jPanel7.setLayout(new java.awt.CardLayout());

        panel_excluir_camiseta.setBackground(new java.awt.Color(245, 162, 139));

        tabela_e_camiseta.setBackground(new java.awt.Color(245, 162, 139));
        tabela_e_camiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Gola", "Manga", "Estampa", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_e_camiseta.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabela_excluir_camiseta.setViewportView(tabela_e_camiseta);

        panel_excluir_camiseta.setLayer(tabela_excluir_camiseta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_excluir_camisetaLayout = new javax.swing.GroupLayout(panel_excluir_camiseta);
        panel_excluir_camiseta.setLayout(panel_excluir_camisetaLayout);
        panel_excluir_camisetaLayout.setHorizontalGroup(
            panel_excluir_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excluir_camisetaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tabela_excluir_camiseta, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panel_excluir_camisetaLayout.setVerticalGroup(
            panel_excluir_camisetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabela_excluir_camiseta, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        tabela_excluir_camiseta.getAccessibleContext().setAccessibleName("tabela_excluir_camiseta");

        jPanel7.add(panel_excluir_camiseta, "panel_excluir_camiseta");
        panel_excluir_camiseta.getAccessibleContext().setAccessibleName("panel_excluir_camiseta");

        panel_excluir_calca.setBackground(new java.awt.Color(245, 162, 139));

        tabela_exclui_calca.setForeground(new java.awt.Color(245, 162, 139));

        tabela_e_calca.setBackground(new java.awt.Color(245, 162, 139));
        tabela_e_calca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Bolsos", "Cor", "Detalhes", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_e_calca.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabela_exclui_calca.setViewportView(tabela_e_calca);

        panel_excluir_calca.setLayer(tabela_exclui_calca, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_excluir_calcaLayout = new javax.swing.GroupLayout(panel_excluir_calca);
        panel_excluir_calca.setLayout(panel_excluir_calcaLayout);
        panel_excluir_calcaLayout.setHorizontalGroup(
            panel_excluir_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(panel_excluir_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabela_exclui_calca, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
        );
        panel_excluir_calcaLayout.setVerticalGroup(
            panel_excluir_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(panel_excluir_calcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabela_exclui_calca, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );

        tabela_exclui_calca.getAccessibleContext().setAccessibleName("tabela_excluir_camiseta");
        tabela_exclui_calca.getAccessibleContext().setAccessibleDescription("");

        jPanel7.add(panel_excluir_calca, "panel_excluir_calca");
        panel_excluir_calca.getAccessibleContext().setAccessibleName("panel_excluir_calca");

        panel_excluir_principal.setBackground(new java.awt.Color(157, 121, 115));

        jLabel46.setText("Selecione o tipo acima!");

        javax.swing.GroupLayout panel_excluir_principalLayout = new javax.swing.GroupLayout(panel_excluir_principal);
        panel_excluir_principal.setLayout(panel_excluir_principalLayout);
        panel_excluir_principalLayout.setHorizontalGroup(
            panel_excluir_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excluir_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        panel_excluir_principalLayout.setVerticalGroup(
            panel_excluir_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excluir_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jPanel7.add(panel_excluir_principal, "panel_excluir_principal");
        panel_excluir_principal.getAccessibleContext().setAccessibleName("panel_excluir_principal");

        c_excluir_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Calça", "Camiseta" }));
        c_excluir_item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c_excluir_itemItemStateChanged(evt);
            }
        });
        c_excluir_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_excluir_itemMouseClicked(evt);
            }
        });
        c_excluir_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_excluir_itemActionPerformed(evt);
            }
        });

        b_Confirma_excluir.setText("Excluir");
        b_Confirma_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Confirma_excluirActionPerformed(evt);
            }
        });

        P_Excluir.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Excluir.setLayer(c_excluir_item, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Excluir.setLayer(b_Confirma_excluir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_ExcluirLayout = new javax.swing.GroupLayout(P_Excluir);
        P_Excluir.setLayout(P_ExcluirLayout);
        P_ExcluirLayout.setHorizontalGroup(
            P_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_ExcluirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_Confirma_excluir))
                    .addComponent(c_excluir_item, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_ExcluirLayout.setVerticalGroup(
            P_ExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_excluir_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_Confirma_excluir)
                .addContainerGap())
        );

        Paineis.add(P_Excluir, "P_Excluir");
        P_Excluir.getAccessibleContext().setAccessibleName("P_Excluir");

        P_Listar.setBackground(new java.awt.Color(115, 104, 103));

        c_selecao_listar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Calça", "Camiseta" }));
        c_selecao_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_selecao_listarActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new java.awt.CardLayout());

        p_vendas_camiseta.setLayout(new java.awt.CardLayout());

        tabela_vendas_camiseta.setBackground(new java.awt.Color(115, 104, 103));

        t_vendas_camiseta.setBackground(new java.awt.Color(115, 104, 103));
        t_vendas_camiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Gola", "Mangas", "Tamanho", "Estampa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_vendas_camiseta.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabela_vendas_camiseta.setViewportView(t_vendas_camiseta);
        t_vendas_camiseta.getAccessibleContext().setAccessibleName("t_vendas_camiseta");

        p_vendas_camiseta.add(tabela_vendas_camiseta, "card2");
        tabela_vendas_camiseta.getAccessibleContext().setAccessibleName("tabela_vendas_camiseta");

        jPanel5.add(p_vendas_camiseta, "p_vendas_camiseta");
        p_vendas_camiseta.getAccessibleContext().setAccessibleName("p_vendas_camiseta");

        p_vendas_calca.setLayout(new java.awt.CardLayout());

        tabela_vendas_calca.setBackground(new java.awt.Color(115, 104, 103));

        t_vendas_calca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Cor", "Bolsos", "Tamanho", "Detalhes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_vendas_calca.setViewportView(t_vendas_calca);
        t_vendas_calca.getAccessibleContext().setAccessibleName("t_vendas_calca");

        p_vendas_calca.add(tabela_vendas_calca, "tabela_vendas_calca");
        tabela_vendas_calca.getAccessibleContext().setAccessibleName("tabela_vendas_calca");

        jPanel5.add(p_vendas_calca, "p_vendas_calca");
        p_vendas_calca.getAccessibleContext().setAccessibleName("p_vendas_valca");

        panel_vendas_principal.setBackground(new java.awt.Color(115, 104, 103));

        jLabel24.setText("Selecione o tipo acima!");

        javax.swing.GroupLayout panel_vendas_principalLayout = new javax.swing.GroupLayout(panel_vendas_principal);
        panel_vendas_principal.setLayout(panel_vendas_principalLayout);
        panel_vendas_principalLayout.setHorizontalGroup(
            panel_vendas_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vendas_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        panel_vendas_principalLayout.setVerticalGroup(
            panel_vendas_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vendas_principalLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 339, Short.MAX_VALUE))
        );

        jPanel5.add(panel_vendas_principal, "panel_vendas_principal");
        panel_vendas_principal.getAccessibleContext().setAccessibleName("panel_vendas_principal");

        P_Listar.setLayer(c_selecao_listar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Listar.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_ListarLayout = new javax.swing.GroupLayout(P_Listar);
        P_Listar.setLayout(P_ListarLayout);
        P_ListarLayout.setHorizontalGroup(
            P_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_selecao_listar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_ListarLayout.setVerticalGroup(
            P_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_selecao_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        Paineis.add(P_Listar, "P_Listar");
        P_Listar.getAccessibleContext().setAccessibleName("P_Listar");

        P_Vender.setBackground(new java.awt.Color(113, 137, 129));

        jPanel6.setBackground(new java.awt.Color(113, 137, 129));
        jPanel6.setLayout(new java.awt.CardLayout());

        panel_vender_principal.setBackground(new java.awt.Color(113, 137, 129));

        jLabel45.setText("Selecione o tipo acima!");

        javax.swing.GroupLayout panel_vender_principalLayout = new javax.swing.GroupLayout(panel_vender_principal);
        panel_vender_principal.setLayout(panel_vender_principalLayout);
        panel_vender_principalLayout.setHorizontalGroup(
            panel_vender_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vender_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        panel_vender_principalLayout.setVerticalGroup(
            panel_vender_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vender_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPanel6.add(panel_vender_principal, "panel_vender_principal");
        panel_vender_principal.getAccessibleContext().setAccessibleName("panel_vender_principal");

        panel_v_calca.setLayout(new java.awt.CardLayout());

        tabela_vender_calca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Cor", "Bolsos", "Tamanho", "Detalhes", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_v_calca.setViewportView(tabela_vender_calca);
        tabela_vender_calca.getAccessibleContext().setAccessibleName("tabela_vender_calca");

        panel_v_calca.add(tabela_v_calca, "tabela_v_calca");
        tabela_v_calca.getAccessibleContext().setAccessibleName("tabela_v_calca");

        jPanel6.add(panel_v_calca, "panel_v_calca");
        panel_v_calca.getAccessibleContext().setAccessibleName("panel_v_calca");

        panel_v_camiseta.setLayout(new java.awt.CardLayout());

        tabela_vender_camiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Fornecedor", "Gola", "Mangas", "Tamanho", "Estampa", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_v_camiseta.setViewportView(tabela_vender_camiseta);
        tabela_vender_camiseta.getAccessibleContext().setAccessibleName("tabela_vender_camiseta");

        panel_v_camiseta.add(tabela_v_camiseta, "tabela_v_calca");
        tabela_v_camiseta.getAccessibleContext().setAccessibleName("tabela_v_calca");

        jPanel6.add(panel_v_camiseta, "panel_v_camiseta");
        panel_v_camiseta.getAccessibleContext().setAccessibleName("panel_v_camiseta");

        c_selecao_vender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Calça", "Camiseta" }));
        c_selecao_vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_selecao_venderMouseClicked(evt);
            }
        });
        c_selecao_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_selecao_venderActionPerformed(evt);
            }
        });

        b_vender.setText("Vender");
        b_vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_venderMouseClicked(evt);
            }
        });
        b_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_venderActionPerformed(evt);
            }
        });
        b_vender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_venderKeyPressed(evt);
            }
        });

        panel_textos.setBackground(new java.awt.Color(113, 137, 129));

        jLabel44.setText("Quantidade");

        c_vender_qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_vender_qntActionPerformed(evt);
            }
        });

        jLabel36.setText("Código");

        c_vender_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_vender_codigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_textosLayout = new javax.swing.GroupLayout(panel_textos);
        panel_textos.setLayout(panel_textosLayout);
        panel_textosLayout.setHorizontalGroup(
            panel_textosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_textosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_textosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(c_vender_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(panel_textosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_vender_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_textosLayout.setVerticalGroup(
            panel_textosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_textosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_textosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_textosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_vender_qnt)
                    .addComponent(c_vender_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        P_Vender.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Vender.setLayer(c_selecao_vender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Vender.setLayer(b_vender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        P_Vender.setLayer(panel_textos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_VenderLayout = new javax.swing.GroupLayout(P_Vender);
        P_Vender.setLayout(P_VenderLayout);
        P_VenderLayout.setHorizontalGroup(
            P_VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_VenderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_selecao_vender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_VenderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_vender))
                    .addComponent(panel_textos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_VenderLayout.setVerticalGroup(
            P_VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_VenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_selecao_vender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(panel_textos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(b_vender)
                .addContainerGap())
        );

        panel_textos.getAccessibleContext().setAccessibleName("panel_textos");

        Paineis.add(P_Vender, "P_Vender");
        P_Vender.getAccessibleContext().setAccessibleName("P_Vender");

        P_Principal.setBackground(new java.awt.Color(59, 75, 89));

        jLabel7.setFont(new java.awt.Font("Street - Plain", 0, 48)); // NOI18N
        jLabel7.setForeground(java.awt.Color.lightGray);
        jLabel7.setText("Bem Vindo! ");

        P_Principal.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout P_PrincipalLayout = new javax.swing.GroupLayout(P_Principal);
        P_Principal.setLayout(P_PrincipalLayout);
        P_PrincipalLayout.setHorizontalGroup(
            P_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PrincipalLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(169, 169, 169))
        );
        P_PrincipalLayout.setVerticalGroup(
            P_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PrincipalLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(198, 198, 198))
        );

        Paineis.add(P_Principal, "P_Principal");
        P_Principal.getAccessibleContext().setAccessibleName("P_Principal");

        jMenu1.setText("Arquivo");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Título, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Submenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Vender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(Paineis)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Submenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(B_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(B_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(B_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(B_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(B_listar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(B_Vender, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(Paineis, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    fechaPanels();
    P_Alterar.setVisible(true);
    fechaAlterar();
    panel_alterar_principal.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    fechaPanels();
    P_Buscar.setVisible(true);
    fechaBuscar();
    p_buscar_principal.setVisible(true); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    fechaPanels();
    P_Cadastrar.setVisible(true);
    fechaCadastrar();
    P_Cadastro_Principal.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    fechaPanels();
    P_Excluir.setVisible(true);
    fechaExcluir();
    panel_excluir_principal.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    fechaPanels();
    P_Listar.setVisible(true);
    fechaVendas();
    panel_vendas_principal.setVisible(true);  
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    fechaPanels();
    P_Vender.setVisible(true);
    fechaVender();
    panel_vender_principal.setVisible(true);  
    }//GEN-LAST:event_jLabel6MouseClicked

    private void campo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_tipoActionPerformed
    if(!campo_tipo.getSelectedItem().equals("Selecione o tipo")){
        if (campo_tipo.getSelectedItem().equals("Calça")){
            fechaCadastrar();
             P_Cadastrar_Calca.setVisible(true);
        }
        else {
        fechaCadastrar();
        P_Cadastrar_Camiseta.setVisible(true);
        }
    }
    else{
        fechaCadastrar();
        P_Cadastro_Principal.setVisible(true);
    }
    }//GEN-LAST:event_campo_tipoActionPerformed

    private void selecao_buscaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecao_buscaItemStateChanged
    
    }//GEN-LAST:event_selecao_buscaItemStateChanged

    private void b_Confirma_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Confirma_excluirActionPerformed
    if(c_excluir_item.getSelectedItem().equals("Calça")){
        calca.excluiCalca(tabela_e_calca);
     }

    else if(c_excluir_item.getSelectedItem().equals("Camiseta")){
       camiseta.excluiCamiseta(tabela_e_camiseta);
    }
    else{
        JOptionPane.showMessageDialog(null, "Selecione um tipo de item para excluir", "Falha!", 0);
    }
    }//GEN-LAST:event_b_Confirma_excluirActionPerformed

    private void c_vender_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_vender_codigoActionPerformed
        
    }//GEN-LAST:event_c_vender_codigoActionPerformed

    private void c_gola_camisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_gola_camisetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_gola_camisetaActionPerformed

    private void selecao_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecao_buscaActionPerformed
        if(!selecao_busca.getSelectedItem().equals("Selecione")){
            if(selecao_busca.getSelectedItem().equals("Calça")){
                fechaBuscar();
                P_Calca.setVisible(true);
                calca.mostraCalca(tabela_calca, contrest.ListaCalca);
            }
            else{
                fechaBuscar();
                P_Camiseta.setVisible(true);
                camiseta.mostraCamiseta(tabela_camiseta, contrest.ListaCamiseta);
            }
        }
        else{
            fechaBuscar();
            p_buscar_principal.setVisible(true);
        }
    }//GEN-LAST:event_selecao_buscaActionPerformed

    private void b_Camiseta_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Camiseta_SalvarActionPerformed
    tipo = 2;
    
    if(!c_camiseta_mangas.getSelectedItem().equals("Selecione")){
        if(c_camiseta_mangas.getSelectedItem().equals("Sim"))
                mangas = true;
        else
            mangas = false;
    }
    if(!c_gola_camiseta.getSelectedItem().equals("Selecione")){
        if(c_gola_camiseta.getSelectedItem().equals("Careca"))
            gola = "Careca";
        else
            gola = "Redonda";
    }
    //int tipo, int quantidade, int tamanho, String fornecedor, String marca,
                                    //String e, String g, boolean m){
    camiseta.cadastraCamiseta(tipo, Integer.parseInt(c_qnt_camiseta.getText()), Integer.parseInt(c_tamanho_camiseta.getText()),c_fornecedor_camiseta.getText(), c_marca_camiseta.getText(), c_estampa_camiseta.getText(),gola, mangas);
    
    limpaCampos();
    }//GEN-LAST:event_b_Camiseta_SalvarActionPerformed

    private void P_Cadastrar_CalcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_Cadastrar_CalcaMouseClicked

    }//GEN-LAST:event_P_Cadastrar_CalcaMouseClicked

    private void b_Salvar_CalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Salvar_CalcaActionPerformed
    tipo = 1;
    
    if(!c_bolsos_calca.getSelectedItem().equals("Selecione")){
        if(c_bolsos_calca.getSelectedItem().equals("Sim"))
            bolsos = true;
        else
            bolsos = false;
    }

    calca.cadastraCalca(tipo, Integer.parseInt(c_qnt_calca.getText()), Integer.parseInt(c_tamanho_calca.getText()), c_fornecedor_calca.getText(), c_marca_calca.getText(), c_cor_calca.getText(), bolsos, c_detalhes_calca.getText());
    limpaCampos();
    }//GEN-LAST:event_b_Salvar_CalcaActionPerformed

    private void c_excluir_itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c_excluir_itemItemStateChanged
        
    }//GEN-LAST:event_c_excluir_itemItemStateChanged

    private void c_calca_novo_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_calca_novo_corActionPerformed

    }//GEN-LAST:event_c_calca_novo_corActionPerformed

    private void c_calca_novo_detalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_calca_novo_detalhesActionPerformed

    }//GEN-LAST:event_c_calca_novo_detalhesActionPerformed

    private void c_camiseta_novo_estampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_camiseta_novo_estampaActionPerformed

    }//GEN-LAST:event_c_camiseta_novo_estampaActionPerformed

    private void c_alterar_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c_alterar_tipoItemStateChanged
       
    }//GEN-LAST:event_c_alterar_tipoItemStateChanged

    private void c_camiseta_novo_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_camiseta_novo_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_camiseta_novo_fornecedorActionPerformed

    private void c_camiseta_novo_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_camiseta_novo_tamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_camiseta_novo_tamanhoActionPerformed

    private void c_camiseta_novo_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_camiseta_novo_quantidadeActionPerformed

    }//GEN-LAST:event_c_camiseta_novo_quantidadeActionPerformed

    private void c_selecao_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_selecao_venderActionPerformed
 fechaVender();
        
        panel_vender_principal.setVisible(true);

        if(!c_selecao_vender.getSelectedItem().equals("Selecione")){
            if(c_selecao_vender.getSelectedItem().equals("Calça")){
                fechaVender();
                panel_v_calca.setVisible(true);
                panel_textos.setVisible(true);
                calca.mostraCalca(tabela_vender_calca, contrest.ListaCalca);
            }
            else{
                fechaVender();
                panel_v_camiseta.setVisible(true);
                panel_textos.setVisible(true);
                camiseta.mostraCamiseta(tabela_vender_camiseta, contrest.ListaCamiseta);
            }
        }
        else{
            fechaVender();
            panel_vender_principal.setVisible(true);
            
        }
    }//GEN-LAST:event_c_selecao_venderActionPerformed

    private void c_vender_qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_vender_qntActionPerformed

    }//GEN-LAST:event_c_vender_qntActionPerformed

    private void b_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_venderActionPerformed
    
    }//GEN-LAST:event_b_venderActionPerformed

    private void c_selecao_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_selecao_listarActionPerformed

        if(!c_selecao_listar.getSelectedItem().equals("Selecione")){
           if(c_selecao_listar.getSelectedItem().equals("Calça")){
               fechaVendas();
               p_vendas_calca.setVisible(true);
               calca.mostraVendasCalca(t_vendas_calca, contrest.ListaVendaCalca);
           }
           else{
               fechaVendas();
               p_vendas_camiseta.setVisible(true);
               camiseta.mostraVendasCamiseta(t_vendas_camiseta, contrest.ListaVendaCamiseta);
           }
       }
       else{
           fechaVendas();
           panel_vendas_principal.setVisible(true);
           
       }
    }//GEN-LAST:event_c_selecao_listarActionPerformed

    private void B_ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExcluirMouseClicked

    }//GEN-LAST:event_B_ExcluirMouseClicked

    private void c_selecao_venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_selecao_venderMouseClicked

    }//GEN-LAST:event_c_selecao_venderMouseClicked

    private void B_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AlterarMouseClicked
    
    }//GEN-LAST:event_B_AlterarMouseClicked

    private void B_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_BuscarMouseClicked
           // TODO add your handling code here:
    }//GEN-LAST:event_B_BuscarMouseClicked

    private void B_VenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VenderMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_B_VenderMouseClicked

    private void B_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CadastrarMouseClicked
       
    }//GEN-LAST:event_B_CadastrarMouseClicked

    private void B_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_listarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_listarMouseClicked

    private void B_ExcluirAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_B_ExcluirAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ExcluirAncestorAdded

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void P_ExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_P_ExcluirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_ExcluirKeyPressed

    private void c_excluir_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_excluir_itemMouseClicked

    }//GEN-LAST:event_c_excluir_itemMouseClicked

    private void c_excluir_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_excluir_itemActionPerformed
    if(!c_excluir_item.getSelectedItem().equals("Selecione")){
    
            if(c_excluir_item.getSelectedItem().equals("Calça")){
                fechaExcluir();
                panel_excluir_calca.setVisible(true);
                calca.mostraCalca(tabela_e_calca, contrest.ListaCalca);
            }
            else{
                fechaExcluir();
                panel_excluir_camiseta.setVisible(true);
                camiseta.mostraCamiseta(tabela_e_camiseta, contrest.ListaCamiseta);
            }
        }
        else{
        fechaExcluir();
        panel_excluir_principal.setVisible(true);
        }                // TODO add your handling code here:
    }//GEN-LAST:event_c_excluir_itemActionPerformed

    private void c_alterar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_alterar_tipoActionPerformed
if(!c_alterar_tipo.getSelectedItem().equals("Selecione")){
           if(c_alterar_tipo.getSelectedItem().equals("Calça")){
               fechaAlterar();
               panel_alterar_calca.setVisible(true);
               calca.mostraCalca(t_a_calca, contrest.ListaCalca);
               
           }
           else{
               fechaAlterar();
               panel_alterar_camiseta.setVisible(true);
               camiseta.mostraCamiseta(t_a_camiseta, contrest.ListaCamiseta);
           }
       }
       else{
           fechaAlterar();
           panel_alterar_principal.setVisible(true);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_c_alterar_tipoActionPerformed

    private void b_venderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_venderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_venderKeyPressed

    private void b_venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_venderMouseClicked

        if(!c_selecao_vender.getSelectedItem().equals("Selecione")){
            if(!c_vender_codigo.getText().equals("") && !c_vender_qnt.getText().equals("")){
                if(c_selecao_vender.getSelectedItem().equals("Calça")){
                        calca.venderCalca(Integer.parseInt(c_vender_codigo.getText()), Integer.parseInt(c_vender_qnt.getText()), contrest.ListaCalca);
                        calca.mostraCalca(tabela_vender_calca, contrest.ListaCalca);
                        }
                        else{
                        camiseta.venderCamiseta(Integer.parseInt(c_vender_codigo.getText()), Integer.parseInt(c_vender_qnt.getText()), contrest.ListaCamiseta);
                        camiseta.mostraCamiseta(tabela_vender_camiseta, contrest.ListaCamiseta);
                    }
                }
            else{
                JOptionPane.showMessageDialog(null, "Digite os dados da venda!", "Falha", 0);
                }
        }
        else{
            fechaVender();
            panel_vender_principal.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b_venderMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Func_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel B_Alterar;
    private javax.swing.JPanel B_Buscar;
    private javax.swing.JPanel B_Cadastrar;
    private javax.swing.JPanel B_Excluir;
    private javax.swing.JPanel B_Vender;
    private javax.swing.JPanel B_listar;
    private javax.swing.JDesktopPane P_Alterar;
    private javax.swing.JDesktopPane P_Buscar;
    private javax.swing.JDesktopPane P_Cadastrar;
    private javax.swing.JDesktopPane P_Cadastrar_Calca;
    private javax.swing.JDesktopPane P_Cadastrar_Camiseta;
    private javax.swing.JDesktopPane P_Cadastro_Principal;
    private javax.swing.JDesktopPane P_Calca;
    private javax.swing.JDesktopPane P_Camiseta;
    private javax.swing.JDesktopPane P_Excluir;
    private javax.swing.JDesktopPane P_Listar;
    private javax.swing.JDesktopPane P_Principal;
    private javax.swing.JDesktopPane P_Vender;
    private javax.swing.JDesktopPane Paineis;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JPanel Submenu;
    private javax.swing.JPanel Título;
    private javax.swing.JButton b_Camiseta_Salvar;
    private javax.swing.JButton b_Confirma_excluir;
    private javax.swing.JButton b_Salvar_Calca;
    private javax.swing.JButton b_alterar_salvar;
    private javax.swing.JButton b_vender;
    private javax.swing.JComboBox<String> c_alterar_tipo;
    private javax.swing.JComboBox<String> c_bolsos_calca;
    private javax.swing.JComboBox<String> c_calca_novo_bolsos;
    private javax.swing.JTextField c_calca_novo_cor;
    private javax.swing.JTextField c_calca_novo_detalhes;
    private javax.swing.JTextField c_calca_novo_fornecedor;
    private javax.swing.JTextField c_calca_novo_marca;
    private javax.swing.JTextField c_calca_novo_quantidade;
    private javax.swing.JTextField c_calca_novo_tamanho;
    private javax.swing.JComboBox<String> c_camiseta_mangas;
    private javax.swing.JTextField c_camiseta_novo_estampa;
    private javax.swing.JTextField c_camiseta_novo_fornecedor;
    private javax.swing.JComboBox<String> c_camiseta_novo_gola;
    private javax.swing.JComboBox<String> c_camiseta_novo_mangas;
    private javax.swing.JTextField c_camiseta_novo_marca;
    private javax.swing.JTextField c_camiseta_novo_quantidade;
    private javax.swing.JTextField c_camiseta_novo_tamanho;
    private javax.swing.JTextField c_cor_calca;
    private javax.swing.JTextField c_detalhes_calca;
    private javax.swing.JTextField c_estampa_camiseta;
    private javax.swing.JComboBox<String> c_excluir_item;
    private javax.swing.JTextField c_fornecedor_calca;
    private javax.swing.JTextField c_fornecedor_camiseta;
    private javax.swing.JComboBox<String> c_gola_camiseta;
    private javax.swing.JTextField c_marca_calca;
    private javax.swing.JTextField c_marca_camiseta;
    private javax.swing.JTextField c_qnt_calca;
    private javax.swing.JTextField c_qnt_camiseta;
    private javax.swing.JComboBox<String> c_selecao_listar;
    private javax.swing.JComboBox<String> c_selecao_vender;
    private javax.swing.JTextField c_tamanho_calca;
    private javax.swing.JTextField c_tamanho_camiseta;
    private javax.swing.JTextField c_vender_codigo;
    private javax.swing.JTextField c_vender_qnt;
    private javax.swing.JComboBox<String> campo_tipo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel p_buscar_principal;
    private javax.swing.JPanel p_vendas_calca;
    private javax.swing.JPanel p_vendas_camiseta;
    private javax.swing.JDesktopPane panel_alterar_calca;
    private javax.swing.JDesktopPane panel_alterar_camiseta;
    private javax.swing.JDesktopPane panel_alterar_principal;
    private javax.swing.JDesktopPane panel_excluir_calca;
    private javax.swing.JDesktopPane panel_excluir_camiseta;
    private javax.swing.JPanel panel_excluir_principal;
    private javax.swing.JPanel panel_textos;
    private javax.swing.JPanel panel_v_calca;
    private javax.swing.JPanel panel_v_camiseta;
    private javax.swing.JPanel panel_vendas_principal;
    private javax.swing.JPanel panel_vender_principal;
    private javax.swing.JComboBox<String> selecao_busca;
    private javax.swing.JTable t_a_calca;
    private javax.swing.JTable t_a_camiseta;
    private javax.swing.JTable t_vendas_calca;
    private javax.swing.JTable t_vendas_camiseta;
    private javax.swing.JScrollPane tabela_a_calca;
    private javax.swing.JScrollPane tabela_a_camiseta;
    private javax.swing.JScrollPane tabela_busca_calca;
    private javax.swing.JScrollPane tabela_busca_camiseta;
    private javax.swing.JTable tabela_calca;
    private javax.swing.JTable tabela_camiseta;
    private javax.swing.JTable tabela_e_calca;
    private javax.swing.JTable tabela_e_camiseta;
    private javax.swing.JScrollPane tabela_exclui_calca;
    private javax.swing.JScrollPane tabela_excluir_camiseta;
    private javax.swing.JScrollPane tabela_v_calca;
    private javax.swing.JScrollPane tabela_v_camiseta;
    private javax.swing.JScrollPane tabela_vendas_calca;
    private javax.swing.JScrollPane tabela_vendas_camiseta;
    private javax.swing.JTable tabela_vender_calca;
    private javax.swing.JTable tabela_vender_camiseta;
    // End of variables declaration//GEN-END:variables
}
