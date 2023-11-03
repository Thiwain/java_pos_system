/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gui.AddressView;
import gui.CompanyRegistration;
import gui.CustomerRegistration;
import gui.EmployeeRegistration;
import gui.GRN;
import gui.Home;
import gui.Stock;
import gui.SupplierRegistration;

/**
 *
 * @author Acer
 */
public class env {

    /**
     * @return the address
     */
    public static boolean isAddress() {
        return address;
    }

    /**
     * @param aAddress the address to set
     */
    public static void setAddress(boolean aAddress) {
        address = aAddress;
    }

    /**
     * @return the company
     */
    public static boolean isCompany() {
        return company;
    }

    /**
     * @param aCompany the company to set
     */
    public static void setCompany(boolean aCompany) {
        company = aCompany;
    }

    /**
     * @return the customer
     */
    public static boolean isCustomer() {
        return customer;
    }

    /**
     * @param aCustomer the customer to set
     */
    public static void setCustomer(boolean aCustomer) {
        customer = aCustomer;
    }

    /**
     * @return the emplopye
     */
    public static boolean isEmplopye() {
        return emplopye;
    }

    /**
     * @param aEmplopye the emplopye to set
     */
    public static void setEmplopye(boolean aEmplopye) {
        emplopye = aEmplopye;
    }

    /**
     * @return the grn
     */
    public static boolean isGrn() {
        return grn;
    }

    /**
     * @param aGrn the grn to set
     */
    public static void setGrn(boolean aGrn) {
        grn = aGrn;
    }

    /**
     * @return the stock
     */
    public static boolean isStock() {
        return stock;
    }

    /**
     * @param aStock the stock to set
     */
    public static void setStock(boolean aStock) {
        stock = aStock;
    }

    /**
     * @return the supplier
     */
    public static boolean isSupplier() {
        return supplier;
    }

    /**
     * @param aSupplier the supplier to set
     */
    public static void setSupplier(boolean aSupplier) {
        supplier = aSupplier;
    }

    public static void getTheme() {
        FlatMacLightLaf.setup();
    }

    private static String title = "Store";//Title

    public static String getTitle() {
        return title;
    }

    private static String icoPath = "/img/icon.png";//Icon Path

    public static String getIcoPath() {
        return icoPath;
    }

    ///Window Open
    private static boolean address = true;
    private static boolean company = true;
    private static boolean customer = true;
    private static boolean emplopye = true;
    private static boolean grn = true;
    private static boolean stock = true;
    private static boolean supplier = true;

    public static void openAddress() {
        if (isAddress() == true) {
            new AddressView().setVisible(true);
        }
    }

    public static void openCompRrg() {
        if (isCompany() == true) {
            new CompanyRegistration().setVisible(true);
        }
    }

    public static void openCusReg() {
        if (isCustomer() == true) {
            new CustomerRegistration().setVisible(true);
        }
    }

    public static void openEmpReg() {
        if (isEmplopye() == true) {
            new EmployeeRegistration().setVisible(true);
        }
    }

    public static void openGRN() {
        if (isGrn() == true) {
            new GRN().setVisible(true);
        }
    }

    public static void openStock() {
        if (isStock() == true) {
            new Stock().setVisible(true);
        }
    }

    public static void openSupplierReg() {
        if (isSupplier() == true) {
            new SupplierRegistration().setVisible(true);
        }
    }
    ///Window Open
    
  
}
