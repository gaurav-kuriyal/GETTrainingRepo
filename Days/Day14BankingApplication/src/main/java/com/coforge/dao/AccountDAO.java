package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.coforge.model.Account;

public class AccountDAO {
	private static final Logger logger = LogManager.getLogger(AccountDAO.class);
	public static List<Account> getAllAccounts(Connection con) throws SQLException{
		String query="select * from account";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<Account> accList = new ArrayList<Account>();
		
		while(rs.next()) {
			Account acc = new Account();
			acc.setAccNo(rs.getInt("accNo"));
			acc.setAccHolderName(rs.getString("accHolderName"));
			acc.setAccType(rs.getString("accType"));
			acc.setBalance(rs.getDouble("balance"));
			accList.add(acc);
		}
		
		return accList;
	}
	
	public static void addNewAccount(Connection con,Account acc) throws SQLException{
		String query="insert into account (accNo,accHolderName,accType,balance) values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,acc.getAccNo());
		ps.setString(2,acc.getAccHolderName());
		ps.setString(3,acc.getAccType());
		ps.setDouble(4,acc.getBalance());
		ps.executeUpdate();
		
	}
	
	public static void editAccount(Connection con,Account acc) throws SQLException{
		String query="update account set accHolderName=?,accType=?,balance=? where accNo = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,acc.getAccHolderName());
		ps.setString(2,acc.getAccType());
		ps.setDouble(3,acc.getBalance());
		ps.setInt(4,acc.getAccNo());
		ps.executeUpdate();
		
	}
	
	public static Account getAccount(Connection con,int accNo) throws SQLException{
		String query="select * from account where accNo = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,accNo);
		ResultSet rs = ps.executeQuery();
		
		Account acc = new Account();
		while(rs.next()) {
			acc.setAccNo(accNo);
			acc.setAccHolderName(rs.getString("accHolderName"));
			acc.setAccType(rs.getString("accType"));
			acc.setBalance(rs.getDouble("balance"));
		}
		
		return acc;
		
	}

	
	public static void deleteAccount(Connection con,int accNo) throws SQLException{
		String query="delete from account where accNo = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,accNo);
		ps.executeUpdate();
	}
	
	public static String transactAccount(Connection con,int accNo,String action,double amount) throws SQLException{
		Account acc = getAccount(con, accNo);
		if(action.equals("withdraw")) {
			if(acc.getBalance()>=amount) {
				acc.setBalance(acc.getBalance()-amount);
				editAccount(con, acc);
				logger.info("Withdraw of Rs. "+amount+" completed");
				return "Withdraw of Rs. "+amount+" completed";
			}
			else {
				logger.info("Insufficient balance");
				return "Insufficient balance";
			}
		}
		else if(action.equals("deposit")) {
			acc.setBalance(acc.getBalance()+amount);
			editAccount(con, acc);
			logger.info("Deposit of Rs. "+amount+" completed");
			return "Deposit of Rs. "+amount+" completed";
		}
		
		logger.info("Failed Transaction");
		return "Failed Transaction";
	}
	
	public static List<Account> getAccountFromQuery(Connection con,String q) throws SQLException{
		String query="select * from account where accNo like ? or accHolderName like ? or accType like ? or balance like ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,'%'+q+'%');
		ps.setString(2,'%'+q+'%');
		ps.setString(3,'%'+q+'%');
		ps.setString(4,'%'+q+'%');
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Account> accList= new ArrayList<Account>();
		while(rs.next()) {
			Account acc = new Account();
			acc.setAccNo(rs.getInt("accNo"));
			acc.setAccHolderName(rs.getString("accHolderName"));
			acc.setAccType(rs.getString("accType"));
			acc.setBalance(rs.getDouble("balance"));
			
			accList.add(acc);
		}
		
		return accList;
		
	}
}
