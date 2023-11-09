package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.app.core.Pens;

import custom_exceptions.PenHandlingException;

import static utils.PenValidation.*;

public class StylrWithPen {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Pens> pens = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Choose Options:\n" + "1.Add a Pen\n" + "2.Upadate stock of a pen\n"
						+ "3.Set discount of 20% for pens not sold in last 3 months\n"
						+ "4.Remove pens which are not sold in last 9 months\n" + "0.exit\n");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter pen details:Brand,color,ink color,material,listing date(yyyy-mm-dd),price\n");
						Pens p = validateAllInputs(Pens.getId(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), pens);
						pens.add(p);
						System.out.println("Pen added");
						break;
					case 2:
						System.out.println("Enter id of pen sold:\n");
						p = pens.remove(sc.nextInt());
						if (p == null)
							throw new PenHandlingException("Invalid id!!");
						System.out.println("Pen removed");
						int stock = Pens.getStock() - 1;
						System.out.println(stock);
						break;
					case 3:
						System.out.println("Enter discount you want to apply:\n");
						Double discount = sc.nextDouble();
						pens.stream()
								.filter(pn -> Period.between(pn.getLdate(), LocalDate.now()).toTotalMonths() > 3
										&& Period.between(pn.getLdate(), LocalDate.now()).toTotalMonths() < 9)
								.forEach(pn -> pn.setPrice(pn.getPrice() - discount));
						pens.forEach(pn -> pn.setUdate(LocalDate.now()));
						pens.forEach(pn -> System.out.println(pn));
						break;
					case 4:
						pens.removeIf(pn -> Period.between(pn.getLdate(), LocalDate.now()).toTotalMonths() > 9);
						pens.forEach(pn -> System.out.println(pn));

					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}

}
