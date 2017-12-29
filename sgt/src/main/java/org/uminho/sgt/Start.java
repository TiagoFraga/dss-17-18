package org.uminho.sgt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.uminho.sgt.data.dao.internal.ShiftDao;
import org.uminho.sgt.data.dao.internal.SubjectDao;
import org.uminho.sgt.data.dao.internal.TradeDao;
import org.uminho.sgt.data.dao.internal.UserDao;

public class Start {
  private static final Logger logger = LogManager.getLogger(Start.class);

  public static void main(String[] args) {
    UserDao userDao = new UserDao();
    SubjectDao subjectDao = new SubjectDao();
    ShiftDao shiftDao = new ShiftDao();
    TradeDao tradeDao = new TradeDao();

    logger.info("Creating students...");
    userDao.addStudent("a65742@alunos.uminho.pt", "Miguel Esteves", "12345678", true);
    userDao.addStudent("a12345@alunos.uminho.pt", "Joaquim Teixeira", "abcdefghi", false);
    userDao.addStudent("a44567@alunos.uminho.pt", "Estrela Joana", "zxyzd614234", false);
    userDao.addStudent("a56192@alunos.uminho.pt", "Rosa Cristiana", "12345678", true);
    userDao.addStudent("a23546@alunos.uminho.pt", "Cristina Rodrigues", "1234lel5678", false);
    userDao.addStudent("a36735@alunos.uminho.pt", "Luis Jorge", "12345678", true);

    logger.info("Creating teachers...");
    userDao.addTeacher("jbb@uminho.pt", "José Bernardo Barros", "ohmanhaskell", false);
    userDao.addTeacher("frade@uminho.pt", "Frade", "12345678", false);
    userDao.addTeacher("als@uminho.pt", "António Luís Sousa", "12345678", true);
    userDao.addTeacher("creissac@uminho.pt", "Creissac", "dssrocks123", false);
    userDao.addTeacher("nestor@uminho.pt", "Nestor", "dssrocks123", false);
    userDao.addTeacher("belo@uminho.pt", "Belo", "bdrocks12345", false);
    userDao.addTeacher("jno@uminho.pt", "JNO", "monades555", false);

    logger.info("Creating subjects...");
    subjectDao.addSubject(
        "mieipi", "Programação Imperativa", "PI", "MIEI", "bachelor", 1, "jbb@uminho.pt");
    subjectDao.addSubject(
        "mieidss",
        "Desenvolvimento de Sistemas de Software",
        "DSS",
        "MIEI",
        "bachelor",
        3,
        "creissac@uminho.pt");
    subjectDao.addSubject(
        "mieibd", "Bases de dados", "BD", "MIEI", "bachelor", 3, "belo@uminho.pt");
    subjectDao.addSubject(
        "mieicp", "Cálculo de Programas", "CP", "MIEI", "bachelor", 2, "jno@uminho.pt");

    logger.info("Creating shifts...");
    shiftDao.addShift(
        "tp1",
        "mieipi",
        "TP",
        "CP1-310",
        60,
        30,
        "monday",
        "10:00:00",
        "12:00:00",
        "frade@uminho.pt");
    shiftDao.addShift(
        "tp2",
        "mieipi",
        "TP",
        "CP1-310",
        60,
        30,
        "tuesday",
        "10:00:00",
        "12:00:00",
        "jbb@uminho.pt");
    shiftDao.addShift(
        "tp3",
        "mieipi",
        "TP",
        "CP1-310",
        60,
        30,
        "wednesday",
        "10:00:00",
        "12:00:00",
        "creissac@uminho.pt");

    shiftDao.addShift(
        "tp1",
        "mieidss",
        "TP",
        "CP1-310",
        60,
        30,
        "wednesday",
        "10:00:00",
        "12:00:00",
        "creissac@uminho.pt");
    shiftDao.addShift(
        "tp2",
        "mieidss",
        "TP",
        "CP1-310",
        60,
        30,
        "thursday",
        "10:00:00",
        "12:00:00",
        "nestor@uminho.pt");

    shiftDao.addShift(
        "tp1",
        "mieibd",
        "TP",
        "CP1-310",
        60,
        30,
        "wednesday",
        "10:00:00",
        "12:00:00",
        "jno@uminho.pt");
    shiftDao.addShift(
        "tp2",
        "mieibd",
        "TP",
        "CP1-310",
        60,
        30,
        "wednesday",
        "10:00:00",
        "12:00:00",
        "creissac@uminho.pt");
    shiftDao.addShift(
        "tp3",
        "mieibd",
        "TP",
        "CP1-310",
        60,
        30,
        "wednesday",
        "10:00:00",
        "12:00:00",
        "creissac@uminho.pt");

    shiftDao.enroll("a65742@alunos.uminho.pt", "tp1", "mieidss");
    shiftDao.enroll("a65742@alunos.uminho.pt", "tp1", "mieibd");
    shiftDao.enroll("a65742@alunos.uminho.pt", "tp2", "mieidss"); // deve dar erro
    shiftDao.enroll("a36735@alunos.uminho.pt", "tp2", "mieidss");

    userDao.markAbsence("a65742@alunos.uminho.pt", "mieidss");
    userDao.markAbsence("a65742@alunos.uminho.pt", "mieidss");
    userDao.markAbsence("a65742@alunos.uminho.pt", "mieipi"); // deve dar erro

    userDao.getAbsences("a65742@alunos.uminho.pt", "mieidss");
    userDao.getAbsences("a65742@alunos.uminho.pt", "mieipi"); // deve dar erro

    userDao.markAbsence("a85743@alunos.uminho.pt", "mieidss"); // deve dar erro

    logger.info(subjectDao.getCoordinator("mieidss"));
    logger.info(shiftDao.getShiftsOf("mieipi"));
    logger.info(subjectDao.getTeachersOf("mieidss"));
    logger.info(shiftDao.getShiftTeacher("tp2", "mieidss"));
    logger.info(userDao.getStudentSubjects("a36735@alunos.uminho.pt"));
    logger.info(userDao.getStudentShift("a36735g@alunos.uminho.pt", "mieidss"));
    logger.info(shiftDao.getSubjectsBy("creissac@uminho.pt"));
    logger.info(shiftDao.getShiftsBy("creissac@uminho.pt", "mieidss"));

    logger.info("Tables:");
    /*logger.info(userDao.getStudents());
    logger.info(userDao.getTeachers());
    logger.info(subjectDao.getSubjects());*/
    logger.info(shiftDao.getShifts());

    logger.info("Attempting to change teacher shift");
    shiftDao.changeShiftTeacher("tp2", "mieipi", "frade@uminho.pt");
    logger.info(shiftDao.getShiftTeacher("tp2", "mieipi"));

    logger.info("Current direct trades: ");
    logger.info(tradeDao.getDirectTrades());
    tradeDao.addDirectTrade(
        "a65742@alunos.uminho.pt", "tp1", "mieidss"); // deve dar erro. já lá está
    tradeDao.addDirectTrade(
        "creissac@uminho.pt", "tp1", "mieibd"); // deve dar erro. creissac não é aluno.
    tradeDao.addDirectTrade("a65742@alunos.uminho.pt", "tp2", "mieidss");
    logger.info("After successfull trade:");
    logger.info(tradeDao.getDirectTrades());

    logger.info("Current trades by request: ");
    logger.info(tradeDao.getTradesByRequest());
    tradeDao.addTradeByRequest(
        "a65742@alunos.uminho.pt", "a36735@alunos.uminho.pt", "mieibd"); // deve dar erro
    tradeDao.addTradeByRequest("a65742@alunos.uminho.pt", "a36735@alunos.uminho.pt", "mieidss");
    logger.info("After successfull trades by request: ");
    logger.info(tradeDao.getTradesByRequest());

  }
}
