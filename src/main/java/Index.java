import Model.Jugador;
import Utils.GeneralUtils;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static Constants.ConstantesApuesta.*;

public class Index extends JFrame {
    private JButton jButton1, jButton2;
    private JComboBox<String> jComboBox1, jComboBox2, jComboBox3, jComboBox4;
    private JFormattedTextField jFormattedTextField1, jFormattedTextField2, jFormattedTextField3,
            jFormattedTextField4, jFormattedTextField5, jFormattedTextField6, jFormattedTextField7,
            jFormattedTextField8;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    private JTextField Jugador1, Jugador2, Jugador3, Jugador4;
    private List<Jugador> jugadorList;

    public Index() {
        initValues();
        initComponentsForm();
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (info.getName().equals(NINBUS)) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    private void initValues() {
        jugadorList = new ArrayList<>();
        jButton1 = new JButton();
        label2 = new JLabel();
        Jugador1 = new JTextField();
        label3 = new JLabel();
        Jugador2 = new JTextField();
        label4 = new JLabel();
        Jugador3 = new JTextField();
        label5 = new JLabel();
        Jugador4 = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        label7.setText("");
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jComboBox3 = new JComboBox<>();
        jComboBox4 = new JComboBox<>();
        label8 = new JLabel();
        label1 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        jFormattedTextField1 = new JFormattedTextField();
        jFormattedTextField2 = new JFormattedTextField();
        jFormattedTextField3 = new JFormattedTextField();
        jFormattedTextField4 = new JFormattedTextField();
        jFormattedTextField5 = new JFormattedTextField();
        jFormattedTextField6 = new JFormattedTextField();
        jFormattedTextField7 = new JFormattedTextField();
        jFormattedTextField8 = new JFormattedTextField();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setLocation(new Point(200, 200));
        setPreferredSize(new Dimension(590, 300));
        setResizable(false);

        jButton1.setText(INICIAR);
        jButton1.setToolTipText(VACIO);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label2.setText(TITULO_REGISTRAR);

        label3.setText(JUGADOR_1);

        label4.setText(JUGADOR_2);

        label5.setText(JUGADOR_3);

        label6.setText(JUGADOR_4);

        jComboBox1.setModel(new DefaultComboBoxModel<>(NOMBRES_CABALLOS));
        jComboBox1.setEnabled(false);

        jComboBox2.setModel(new DefaultComboBoxModel<>(NOMBRES_CABALLOS));
        jComboBox2.setEnabled(false);

        jComboBox3.setModel(new DefaultComboBoxModel<>(NOMBRES_CABALLOS));
        jComboBox3.setEnabled(false);

        jComboBox4.setModel(new DefaultComboBoxModel<>(NOMBRES_CABALLOS));
        jComboBox4.setEnabled(false);

        label8.setText(TITULO_CABALLO);
        label4.getAccessibleContext().setAccessibleName(JUGADOR_2);

        label1.setText(SALDO);

        label9.setText(VALOR_APOSTADO);

        label10.setText(NOMBRE);

        jFormattedTextField1.setEnabled(false);
        jFormattedTextField1.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField2.setEnabled(false);
        jFormattedTextField2.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField3.setEnabled(false);
        jFormattedTextField3.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField4.setEnabled(false);
        jFormattedTextField4.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField5.setEditable(false);
        jFormattedTextField5.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField6.setEditable(false);
        jFormattedTextField6.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField7.setEditable(false);
        jFormattedTextField7.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jFormattedTextField8.setEditable(false);
        jFormattedTextField8.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(NumberFormat.getIntegerInstance())));

        jButton2.setText(APOSTAR);
        jButton2.setToolTipText(VACIO);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void initComponentsForm() {

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Jugador2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jFormattedTextField6, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Jugador3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jFormattedTextField8, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Jugador4, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jFormattedTextField7, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jFormattedTextField4, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 0, 0))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Jugador1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(104, 104, 104)))
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jFormattedTextField5, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(14, Short.MAX_VALUE))))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Jugador1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(Jugador2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(Jugador3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jFormattedTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(Jugador4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jFormattedTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jFormattedTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jFormattedTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jFormattedTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2))
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
        );
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (GeneralUtils.validateEmpty(Jugador1) && GeneralUtils.validateEmpty(Jugador2) && GeneralUtils.validateEmpty(Jugador3)
                && GeneralUtils.validateEmpty(Jugador4)) {
            jugadorList.add(Jugador.builder()
                    .name(Jugador1.getText())
                    .creditosTotales(VALOR_INICIAL)
                    .build());
            jugadorList.add(Jugador.builder()
                    .name(Jugador2.getText())
                    .creditosTotales(VALOR_INICIAL)
                    .build());
            jugadorList.add(Jugador.builder()
                    .name(Jugador3.getText())
                    .creditosTotales(VALOR_INICIAL)
                    .build());
            jugadorList.add(Jugador.builder()
                    .name(Jugador4.getText())
                    .creditosTotales(VALOR_INICIAL)
                    .build());
            cambioIniciar();
            modificarValores();
        }
    }

    public void cambioIniciar() {
        Jugador1.setEnabled(false);
        Jugador2.setEnabled(false);
        Jugador3.setEnabled(false);
        Jugador4.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jFormattedTextField1.setEnabled(true);
        jFormattedTextField2.setEnabled(true);
        jFormattedTextField3.setEnabled(true);
        jFormattedTextField4.setEnabled(true);
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        jComboBox3.setEnabled(true);
        jComboBox4.setEnabled(true);
    }

    public void modificarValores() {
        jFormattedTextField5.setValue(jugadorList.get(0).creditosTotales);
        jFormattedTextField6.setValue(jugadorList.get(1).creditosTotales);
        jFormattedTextField8.setValue(jugadorList.get(2).creditosTotales);
        jFormattedTextField7.setValue(jugadorList.get(3).creditosTotales);
        jFormattedTextField1.setEnabled(jugadorList.get(0).creditosTotales > 0);
        jFormattedTextField2.setEnabled(jugadorList.get(1).creditosTotales > 0);
        jFormattedTextField3.setEnabled(jugadorList.get(2).creditosTotales > 0);
        jFormattedTextField4.setEnabled(jugadorList.get(3).creditosTotales > 0);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {
        if (GeneralUtils.validateValue(jFormattedTextField1, jugadorList.get(0)) && GeneralUtils.validateValue(jFormattedTextField2, jugadorList.get(1)) && GeneralUtils.validateValue(jFormattedTextField3, jugadorList.get(2))
                && GeneralUtils.validateValue(jFormattedTextField4, jugadorList.get(3))) {
            int ganador = (int) (Math.random() * 4);
            setValues();
            int ganadores = 0;
            int creditosApostados = 0;
            int jugadores = 0;
            for (Jugador jugador : jugadorList) {
                if (jugador.getCaballo() == ganador && jugador.getCreditosTotales() > 0) {
                    ganadores = ganadores + 1;
                }
                creditosApostados = creditosApostados + jugador.getCreditosApostados();
            }
            for (Jugador k : jugadorList) {
                if (k.caballo == ganador && ganadores > 0 && k.getCreditosTotales() > 0) {
                    k.setCreditosTotales((k.getCreditosTotales() - k.getCreditosApostados()) + (creditosApostados / ganadores));
                } else {
                    k.setCreditosTotales(k.getCreditosTotales() - k.getCreditosApostados());
                }
                if (k.getCreditosTotales() > 0) {
                    jugadores = jugadores + 1;
                }
            }
            modificarValores();
            jFormattedTextField1.setValue(0);
            jFormattedTextField1.setText("");
            jFormattedTextField2.setValue(0);
            jFormattedTextField2.setText("");
            jFormattedTextField3.setValue(0);
            jFormattedTextField3.setText("");
            jFormattedTextField4.setValue(0);
            jFormattedTextField4.setText("");
            if (jugadores == 0) {
                label7.setText(FIN_JUEGO);
                jButton2.setEnabled(false);
            } else {
                label7.setText(GANADOR + jComboBox1.getItemAt(ganador));
            }
        }
    }

    public void setValues() {
        jugadorList.get(0).setCreditosApostados(Integer.parseInt(jFormattedTextField1.getValue().toString()));
        jugadorList.get(1).setCreditosApostados(Integer.parseInt(jFormattedTextField2.getValue().toString()));
        jugadorList.get(2).setCreditosApostados(Integer.parseInt(jFormattedTextField3.getValue().toString()));
        jugadorList.get(3).setCreditosApostados(Integer.parseInt(jFormattedTextField4.getValue().toString()));
        jugadorList.get(0).setCaballo(jComboBox1.getSelectedIndex());
        jugadorList.get(1).setCaballo(jComboBox2.getSelectedIndex());
        jugadorList.get(2).setCaballo(jComboBox3.getSelectedIndex());
        jugadorList.get(3).setCaballo(jComboBox4.getSelectedIndex());
    }
}