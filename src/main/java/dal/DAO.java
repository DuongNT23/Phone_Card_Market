package dal;

import java.sql.Connection;

public class DAO {
    public DAO() {
        System.out.println("dao");
    }
    public static Connection connection = DBContext.getConnection();
    public static UserDAO userDAO = new UserDAO();
    public static TransactionsDAO transactionsDAO = new TransactionsDAO();
    public static OrderDAO orderDAO = new OrderDAO();
    public static OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
    public static SupplierDAO supplierDAO = new SupplierDAO();
    public static ProductDAO productDAO = new ProductDAO();
    public static StorageDAO storageDAO = new StorageDAO();
    public static NoticeDAO noticeDAO = new NoticeDAO();
    public static PaymentTransactionDAO paymentTransactionDAO = new PaymentTransactionDAO();

}
