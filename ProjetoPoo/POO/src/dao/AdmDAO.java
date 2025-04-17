package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Adm;


public class AdmDAO {
    private Conexao conexao = Conexao.getConexao();
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    public AdmDAO( ) {
    }

    public ResultSet inserirAdm(Adm a) {
        this.query = “INSERT INTO adm(nome, senha, email) VALUES (?, ?, ?)”;

        try {
            this.ps = this.conexao.getConnection().prepareStatement(this.query);
            this.ps.setString(1, a.getNome());
            this.ps.setString(2, a.getSenha());
            this.ps.setString(3, a.getEmail());
            this.ps.executateUpdate();
            {
    catch (SQLexception var3) {
                SQLException ex = var3;
                ex.printStackrTrace();
