/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanct467;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class StudentFrame extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    DefaultTableModel tableModelScore;
    DefaultTableModel tableModelInfo;
    List<Student> studentList = new ArrayList<>();
    List<Score> ScoreList = new ArrayList<>();
    List<SubjectScore> SubjectScoreList = new ArrayList<>();
    List<Info> InfoList = new ArrayList<>();
    /**
     * Creates new form StudentFrame
     */
    
    public StudentFrame() {
        initComponents();
        
        tableModel = (DefaultTableModel) tableSinhVien.getModel();
        showSinhVien();
//        tableModel = (DefaultTableModel) tablePoint.getModel();
//        showPoint();
        tableModelScore = (DefaultTableModel) tablePoint.getModel();
        showSubjectScore();
        tableModelInfo = (DefaultTableModel) tableInfo.getModel();
//        showSum();
        showInfo();
//        Click tableSinhVien
        tableSinhVien.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int selectedIndex = tableSinhVien.getSelectedRow();
                Student std = studentList.get(selectedIndex);
                inputMSSV.setText(std.getMssv());
                inputHoTen.setText(std.getTen());
                inputGioiTinh.setSelectedIndex(std.getGioitinh().equals("Nam")?0:1);
                inputNamSinh.setText(std.getNamsinh());
                inputQueQuan.setText(std.getDiachi());
                inputEmail.setText(std.getEmail());
                inputSDT.setText(std.getSdt());
                inputNganh.setText(std.getNganh());
                inputLop.setText(std.getLop());
                inputKhoa.setSelectedIndex(5);
                inputGhiChu.setText(std.getGhichu());
            }
            
        });
        
//        Click tablePoint
        tablePoint.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int selectedIndex = tablePoint.getSelectedRow();
                SubjectScore ss = SubjectScoreList.get(selectedIndex);
                inputmssv.setText(ss.getMSSV());
                inputMaMon.setText(ss.getMaMon());
                inputKQ.setText(Float.toString(ss.getKQ()));

            }
            
        });
    }

    private void showSinhVien () {
        studentList = StudentModify.findAll();
        
        tableModel.setRowCount(0);
        
        studentList.forEach((student) -> {
            tableModel.addRow(new Object[]{
                tableModel.getRowCount()+1,
                student.getMssv(),
                student.getTen(),
                student.getGioitinh(),
                student.getNamsinh(),
                student.getDiachi(),
                student.getEmail(),
                student.getSdt(),
                student.getLop(),
                student.getNganh(),
                student.getKhoa(),
                student.getGhichu(),
            });
        });
        
    }

    private void showSubjectScore () {
        SubjectScoreList = SubjectScoreModify.findSubjectScoreAll();
        tableModelScore.setRowCount(0);
        SubjectScoreList.forEach((subject_score) -> {
            tableModelScore.addRow(new Object[]{
                tableModelScore.getRowCount()+1,
                subject_score.getTen(),
                subject_score.getMSSV(),
                subject_score.getMaMon(),
                subject_score.getTenMH(),
                subject_score.getSTC(),
                subject_score.getKQ(),
            });
        });
    }
    private void showInfo () {
        InfoList = InfoModify.findInfoAll();
        tableModelInfo.setRowCount(0);
        InfoList.forEach((info) -> {
//            String KQ = String.format("%.2f", InfoModify.tinhtb(info.getMSSV()));
            tableModelInfo.addRow(new Object[]{
                tableModelInfo.getRowCount()+1,
                info.getMSSV(),
                info.getTen(),
                info.getGioitinh(),
                info.getNamsinh(),
                info.getDiachi(),
                info.getLop(),
                info.getNganh(),
                info.getKhoa(),
                info.getDTB(),
            }); });
        showSumInfo();
        
    }
    private void showSumInfo(){
        tongStudent.setText(InfoModify.showSum());
        sumMale.setText(InfoModify.sumMale());
        sumFemale.setText(InfoModify.sumFemale());
        sumXuatSac.setText(InfoModify.sumXuatSac());
        sumGioi.setText(InfoModify.sumGioi());
        sumKha.setText(InfoModify.sumKha());
        sumTrungBinh.setText(InfoModify.sumTrungBinh());
        sumCanhBao.setText(InfoModify.sumCanhBao());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogtk = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        thongkegt = new javax.swing.JButton();
        thongkens = new javax.swing.JButton();
        thongkeqq = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        thongkelop = new javax.swing.JButton();
        thongkenganh = new javax.swing.JButton();
        thongkekhoa = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        sumMale = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sumFemale = new javax.swing.JLabel();
        xuatsac = new javax.swing.JLabel();
        sumXuatSac = new javax.swing.JLabel();
        gioi = new javax.swing.JLabel();
        sumGioi = new javax.swing.JLabel();
        bththongke = new javax.swing.JButton();
        tongStudent = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        kha = new javax.swing.JLabel();
        trungbinh = new javax.swing.JLabel();
        canhbao = new javax.swing.JLabel();
        sumKha = new javax.swing.JLabel();
        sumTrungBinh = new javax.swing.JLabel();
        sumCanhBao = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        inputHoTen = new javax.swing.JTextField();
        inputMSSV = new javax.swing.JTextField();
        inputNamSinh = new javax.swing.JTextField();
        inputQueQuan = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputGioiTinh = new javax.swing.JComboBox<>();
        inputSDT = new javax.swing.JTextField();
        inputNganh = new javax.swing.JTextField();
        inputKhoa = new javax.swing.JComboBox<>();
        inputLop = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputGhiChu = new javax.swing.JTextArea();
        btnLuu = new javax.swing.JButton();
        btnKhoiPhuc = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSinhVien = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputMaMon = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        inputKQ = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePoint = new javax.swing.JTable();
        btnLuu1 = new javax.swing.JButton();
        btnKhoiPhuc1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        inputmssv = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        bthEdit = new javax.swing.JButton();

        dialogtk.setLocation(new java.awt.Point(250, 250));
        dialogtk.setMinimumSize(new java.awt.Dimension(550, 400));
        dialogtk.setModal(true);

        thongkegt.setText("Thong ke sv theo gioi tinh");
        thongkegt.setToolTipText("");
        thongkegt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkegtActionPerformed(evt);
            }
        });

        thongkens.setText("Thong ke sinh vien theo nam sinh");
        thongkens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkensActionPerformed(evt);
            }
        });

        thongkeqq.setText("Thong ke sinh vien theo que quan");
        thongkeqq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeqqActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Chon thong tin can thong ke");

        thongkelop.setText("Thong ke sinh vien theo lop");
        thongkelop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkelopActionPerformed(evt);
            }
        });

        thongkenganh.setText("Thong ke sinh vien theo nganh");
        thongkenganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkenganhActionPerformed(evt);
            }
        });

        thongkekhoa.setText("Thong ke sinh vien theo khoa");
        thongkekhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkekhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(thongkegt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thongkens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thongkeqq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thongkenganh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thongkekhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thongkelop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thongkegt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thongkelop, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thongkekhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thongkens, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thongkeqq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thongkenganh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogtkLayout = new javax.swing.GroupLayout(dialogtk.getContentPane());
        dialogtk.getContentPane().setLayout(dialogtkLayout);
        dialogtkLayout.setHorizontalGroup(
            dialogtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogtkLayout.setVerticalGroup(
            dialogtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Họ tên", "Gioi tinh", "Nam sinh", "Que quan", "Lớp", "Ngành", "Khóa", "Điểm trung bình"
            }
        ));
        tableInfo.setFillsViewportHeight(true);
        jScrollPane4.setViewportView(tableInfo);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tổng số sinh viên:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tổng số sinh viên nam:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Tổng số sinh viên nữ:");

        xuatsac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xuatsac.setText("Tổng số sinh viên loại xuất sắc:");

        gioi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gioi.setText("Tổng số sinh viên loại giỏi:");

        bththongke.setBackground(new java.awt.Color(0, 153, 51));
        bththongke.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bththongke.setForeground(new java.awt.Color(255, 255, 255));
        bththongke.setText("Thống kê");
        bththongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bththongkeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 204));
        jLabel15.setText("Thông Tin Sinh Viên");

        kha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kha.setText("Tổng số sinh viên loại khá:");

        trungbinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trungbinh.setText("Tổng số sinh viên trung bình:");

        canhbao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        canhbao.setText("Tổng số sinh viên bị cảnh báo học vụ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumMale, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tongStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(canhbao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumCanhBao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kha)
                    .addComponent(trungbinh)
                    .addComponent(xuatsac)
                    .addComponent(gioi))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sumKha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sumGioi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sumTrungBinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sumXuatSac, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bththongke, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bththongke, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumXuatSac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xuatsac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gioi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumGioi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sumKha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trungbinh)
                            .addComponent(sumTrungBinh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tongStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(sumMale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(canhbao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumCanhBao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Thông tin", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mã số sinh viên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Năm sinh:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Họ tên:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Quê quán:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Giới tính:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Ngành:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Số điện thoại:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Lớp:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Khóa:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Ghi chú:");

        inputHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHoTenActionPerformed(evt);
            }
        });

        inputMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMSSVActionPerformed(evt);
            }
        });

        inputGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        inputSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSDTActionPerformed(evt);
            }
        });

        inputKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40", "41", "42", "43", "44", "45", "46", "47" }));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(232, 60));

        inputGhiChu.setColumns(20);
        inputGhiChu.setRows(5);
        inputGhiChu.setPreferredSize(new java.awt.Dimension(232, 60));
        jScrollPane1.setViewportView(inputGhiChu);

        btnLuu.setBackground(new java.awt.Color(51, 51, 255));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnKhoiPhuc.setBackground(new java.awt.Color(0, 204, 0));
        btnKhoiPhuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhoiPhuc.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoiPhuc.setText("Làm mới");
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(102, 204, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tableSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Họ tên", "Giới tính", "Năm sinh", "Địa chỉ", "Email", "Số điện thoại", "Lớp", "Ngành", "Khóa", "Ghi chú"
            }
        ));
        tableSinhVien.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(tableSinhVien);

        btnUpdate.setBackground(new java.awt.Color(255, 153, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputHoTen)
                                .addComponent(inputMSSV)
                                .addComponent(inputNamSinh)
                                .addComponent(inputQueQuan)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputSDT)
                            .addComponent(inputNganh)
                            .addComponent(inputKhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputLop)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(inputMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(inputHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(inputGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(inputNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(inputQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        jTabbedPane5.addTab("Quản lý sinh viên", jPanel2);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 0, 204));
        jLabel29.setText("Quản Lý Điểm Sinh Viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã HP:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Kết quả (điểm):");

        inputKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKQActionPerformed(evt);
            }
        });

        tablePoint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "Sinh viên", "Mã HP", "Tên HP", "Tín chi", "Kết quả"
            }
        ));
        tablePoint.setFillsViewportHeight(true);
        jScrollPane3.setViewportView(tablePoint);

        btnLuu1.setBackground(new java.awt.Color(51, 51, 255));
        btnLuu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu1.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu1.setText("Lưu");
        btnLuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu1btnLuuDiemActionPerformed(evt);
            }
        });

        btnKhoiPhuc1.setBackground(new java.awt.Color(0, 204, 51));
        btnKhoiPhuc1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhoiPhuc1.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoiPhuc1.setText("Làm mới");
        btnKhoiPhuc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhuc1btnKhoiPhucDiemActionPerformed(evt);
            }
        });

        btnXoa1.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa1.setText("Xóa");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1btnXoaDiemActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(153, 204, 255));
        btnSearch1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch1.setText("Tìm kiếm");
        btnSearch1.setPreferredSize(new java.awt.Dimension(77, 22));
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1btnSearchDiemActionPerformed(evt);
            }
        });

        inputmssv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputmssvActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("MSSV");

        bthEdit.setBackground(new java.awt.Color(255, 153, 51));
        bthEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bthEdit.setForeground(new java.awt.Color(255, 255, 255));
        bthEdit.setText("Sửa");
        bthEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel32)
                .addContainerGap(710, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(377, 377, 377))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(187, 187, 187)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputmssv, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKhoiPhuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(bthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(205, 205, 205))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputmssv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bthEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhoiPhuc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jTabbedPane5.addTab("Quản lý điểm", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void inputHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHoTenActionPerformed

    private void inputMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMSSVActionPerformed

    private void inputSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSDTActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tableSinhVien.getSelectedRow();
        if(selectedIndex >= 0) {
            Student std = studentList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa sinh viên này không?");
            System.out.println("option : " + option);
            
            if(option == 0) {
                StudentModify.delete(std.getMssv());

                showSinhVien();
                showSubjectScore();
//                showSum();
            }
        }
        showSumInfo();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        // TODO add your handling code here:
        inputMSSV.setText("");
        inputHoTen.setText("");
        inputGioiTinh.setSelectedIndex(0);
        inputNamSinh.setText("");
        inputQueQuan.setText("");
        inputEmail.setText("");
        inputSDT.setText("");
        inputLop.setText("");
        inputNganh.setText("");
        inputKhoa.setSelectedIndex(0);
        inputGhiChu.setText("");  
    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập sinh viên cần tìm:");
        if(input != null && input.length() > 0) {
            studentList = StudentModify.findByMSSV(input);
            tableModel.setRowCount(0);
        
            studentList.forEach((student) -> {
                tableModel.addRow(new Object[]{
                    tableModel.getRowCount()+1,
                    student.getMssv(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getEmail(),
                    student.getSdt(),
                    student.getLop(),
                    student.getNganh(),
                    student.getKhoa(),
                    student.getGhichu(),
            });
            });
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSinhVien();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String mssv     = inputMSSV.getText();
        String hoten    = inputHoTen.getText();
        String gioitinh = inputGioiTinh.getSelectedItem().toString();
        String namsinh  = inputNamSinh.getText();
        String quequan  = inputQueQuan.getText();
        String email    = inputEmail.getText();
        String sdt      = inputSDT.getText();
        String lop      = inputLop.getText();
        String nganh    = inputNganh.getText();
        String khoa     = inputKhoa.getSelectedItem().toString();
        String ghichu   = inputGhiChu.getText();
        
        Student sv = new Student(mssv, 
                hoten, 
                gioitinh, 
                namsinh,
                quequan,
                email,
                sdt,
                lop,
                nganh,
                khoa,
                ghichu);
        StudentModify.insert(sv);
        showSinhVien();
        showSumInfo();
    }//GEN-LAST:event_btnLuuActionPerformed

    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String mssv     = inputMSSV.getText();
        String hoten    = inputHoTen.getText();
        String gioitinh = inputGioiTinh.getSelectedItem().toString();
        String namsinh  = inputNamSinh.getText();
        String quequan  = inputQueQuan.getText();
        String email    = inputEmail.getText();
        String sdt      = inputSDT.getText();
        String lop      = inputLop.getText();
        String nganh    = inputNganh.getText();
        String khoa     = inputKhoa.getSelectedItem().toString();
        String ghichu   = inputGhiChu.getText();
        
        Student sv = new Student(mssv, 
                hoten, 
                gioitinh, 
                namsinh,
                quequan,
                email,
                sdt,
                lop,
                nganh,
                khoa,
                ghichu);
        StudentModify.update(sv);

        showSinhVien();
        showSumInfo();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void bthEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthEditActionPerformed
        // TODO add your handling code here:
        String MSSV = inputmssv.getText();
        String mamon = inputMaMon.getText();
        float kq = Float.parseFloat(inputKQ.getText());

        Score s = new Score(MSSV, mamon, kq);
        ScoreModify.updateScore(s);

        showSubjectScore();
        showInfo();
    }//GEN-LAST:event_bthEditActionPerformed

    private void btnSearch1btnSearchDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1btnSearchDiemActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập sinh viên cần tìm:");
        if(input != null && input.length() > 0) {
            SubjectScoreList = SubjectScoreModify.findByMSSV(input);
            tableModelScore.setRowCount(0);

            SubjectScoreList.forEach((subject) -> {
                tableModelScore.addRow(new Object[]{
                    tableModelScore.getRowCount()+1,
                    subject.getTen(),
                    subject.getMSSV(),
                    subject.getMaMon(),
                    subject.getTenMH(),
                    subject.getSTC(),
                    subject.getKQ(),
                });
            });
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSubjectScore();
        }
    }//GEN-LAST:event_btnSearch1btnSearchDiemActionPerformed

    private void btnXoa1btnXoaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1btnXoaDiemActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tablePoint.getSelectedRow();
        if(selectedIndex >= 0) {
            SubjectScore std = SubjectScoreList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa sinh viên này không?");
            System.out.println("option : " + option);

            if(option == 0) {
                SubjectScoreModify.delete(std.getMSSV(), std.getMaMon());
                showSubjectScore();
            }
        }
        showInfo();
    }//GEN-LAST:event_btnXoa1btnXoaDiemActionPerformed

    private void btnKhoiPhuc1btnKhoiPhucDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhuc1btnKhoiPhucDiemActionPerformed
        // TODO add your handling code here:
        inputmssv.setText("");
        inputMaMon.setText("");
        inputKQ.setText("");
    }//GEN-LAST:event_btnKhoiPhuc1btnKhoiPhucDiemActionPerformed

    private void btnLuu1btnLuuDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu1btnLuuDiemActionPerformed

        String MSSV    =inputmssv.getText();
        String mamon    =inputMaMon.getText();
        float kq = Float.parseFloat(inputKQ.getText());
        Score p = new Score(MSSV,mamon,kq);
        ScoreModify.insertScore(p);
        showSubjectScore();
        showInfo();
    }//GEN-LAST:event_btnLuu1btnLuuDiemActionPerformed

    private void inputKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKQActionPerformed

    private void bththongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bththongkeActionPerformed
        // TODO add your handling code here:
        dialogtk.setVisible(true);
        
    }//GEN-LAST:event_bththongkeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showSumInfo();
        showInfo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void thongkensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkensActionPerformed
        dialogtk.setVisible(false);
        String input = JOptionPane.showInputDialog(this, "Nhập thông tin cần thong kê:");
        if(input != null && input.length() > 0) {
            InfoList = InfoModify.findByNamsinh(input);
            tableModelInfo.setRowCount(0);
        
            InfoList.forEach((student) -> {
                tableModelInfo.addRow(new Object[]{
                    tableModelInfo.getRowCount()+1,
                    student.getMSSV(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getLop(),
                    student.getNganh(),                   
                    student.getDiachi(),
                    student.getKhoa(),

            });
            });
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showInfo();
        }
    }//GEN-LAST:event_thongkensActionPerformed

    private void thongkenganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkenganhActionPerformed
        dialogtk.setVisible(false);
        String input = JOptionPane.showInputDialog(this, "Nhập thông tin cần thong kê:");
        if(input != null && input.length() > 0) {
            InfoList = InfoModify.findByNganh(input);
            tableModelInfo.setRowCount(0);
        
            InfoList.forEach((student) -> {
                tableModelInfo.addRow(new Object[]{
                    tableModelInfo.getRowCount()+1,
                    student.getMSSV(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getLop(),
                    student.getNganh(),                   
                    student.getDiachi(),
                    student.getKhoa(),

            });
            });
        
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSinhVien();
        }
    }//GEN-LAST:event_thongkenganhActionPerformed

    private void thongkegtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkegtActionPerformed
        dialogtk.setVisible(false);
        String input = JOptionPane.showInputDialog(this, "Nhập thông tin cần thong kê:");
        if(input != null && input.length() > 0) {
            InfoList = InfoModify.findByGT(input);
            tableModelInfo.setRowCount(0);
        
            InfoList.forEach((student) -> {
                tableModelInfo.addRow(new Object[]{
                    tableModelInfo.getRowCount()+1,
                    student.getMSSV(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getLop(),
                    student.getNganh(),                   
                    student.getDiachi(),
                    student.getKhoa(),

            });
            });
        
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSinhVien();
        }
    }//GEN-LAST:event_thongkegtActionPerformed

    private void thongkekhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkekhoaActionPerformed
        dialogtk.setVisible(false);
        String input = JOptionPane.showInputDialog(this, "Nhập thông tin cần thong kê:");
        if(input != null && input.length() > 0) {
            InfoList = InfoModify.findByKhoa(input);
            tableModelInfo.setRowCount(0);
        
            InfoList.forEach((student) -> {
                tableModelInfo.addRow(new Object[]{
                    tableModelInfo.getRowCount()+1,
                    student.getMSSV(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getLop(),
                    student.getNganh(),                   
                    student.getDiachi(),
                    student.getKhoa(),

            });
            });
        
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSinhVien();
        }
    }//GEN-LAST:event_thongkekhoaActionPerformed

    private void thongkeqqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeqqActionPerformed
                dialogtk.setVisible(false);
        String input = JOptionPane.showInputDialog(this, "Nhập thông tin cần thong kê:");
        if(input != null && input.length() > 0) {
            InfoList = InfoModify.findByDiachi(input);
            tableModelInfo.setRowCount(0);
        
            InfoList.forEach((student) -> {
                tableModelInfo.addRow(new Object[]{
                    tableModelInfo.getRowCount()+1,
                    student.getMSSV(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getLop(),
                    student.getNganh(),                   
                    student.getDiachi(),
                    student.getKhoa(),

            });
            });
      
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSinhVien();
        }
    }//GEN-LAST:event_thongkeqqActionPerformed

    private void thongkelopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkelopActionPerformed
        dialogtk.setVisible(false);
        String input = JOptionPane.showInputDialog(this, "Nhập thông tin cần thong kê:");
        if(input != null && input.length() > 0) {
            InfoList = InfoModify.findByLop(input);
            tableModelInfo.setRowCount(0);
        
            InfoList.forEach((student) -> {
                tableModelInfo.addRow(new Object[]{
                    tableModelInfo.getRowCount()+1,
                    student.getMSSV(),
                    student.getTen(),
                    student.getGioitinh(),
                    student.getNamsinh(),
                    student.getDiachi(),
                    student.getLop(),
                    student.getNganh(),                   
                    student.getDiachi(),
                    student.getKhoa(),

            });
            });
       
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame,"Không tìm thấy sinh viên","Lỗi tìm kiếm",JOptionPane.ERROR_MESSAGE);
            showSinhVien();
        }
    }//GEN-LAST:event_thongkelopActionPerformed

    private void inputmssvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputmssvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputmssvActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthEdit;
    private javax.swing.JButton bththongke;
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JButton btnKhoiPhuc1;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuu1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JLabel canhbao;
    private javax.swing.JDialog dialogtk;
    private javax.swing.JLabel gioi;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextArea inputGhiChu;
    private javax.swing.JComboBox<String> inputGioiTinh;
    private javax.swing.JTextField inputHoTen;
    private javax.swing.JTextField inputKQ;
    private javax.swing.JComboBox<String> inputKhoa;
    private javax.swing.JTextField inputLop;
    private javax.swing.JTextField inputMSSV;
    private javax.swing.JTextField inputMaMon;
    private javax.swing.JTextField inputNamSinh;
    private javax.swing.JTextField inputNganh;
    private javax.swing.JTextField inputQueQuan;
    private javax.swing.JTextField inputSDT;
    private javax.swing.JTextField inputmssv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel kha;
    private javax.swing.JLabel sumCanhBao;
    private javax.swing.JLabel sumFemale;
    private javax.swing.JLabel sumGioi;
    private javax.swing.JLabel sumKha;
    private javax.swing.JLabel sumMale;
    private javax.swing.JLabel sumTrungBinh;
    private javax.swing.JLabel sumXuatSac;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTable tablePoint;
    private javax.swing.JTable tableSinhVien;
    private javax.swing.JButton thongkegt;
    private javax.swing.JButton thongkekhoa;
    private javax.swing.JButton thongkelop;
    private javax.swing.JButton thongkenganh;
    private javax.swing.JButton thongkens;
    private javax.swing.JButton thongkeqq;
    private javax.swing.JLabel tongStudent;
    private javax.swing.JLabel trungbinh;
    private javax.swing.JLabel xuatsac;
    // End of variables declaration//GEN-END:variables
}
