package utils;

import java.time.LocalDate;
import java.util.List;
import com.app.core.Pens;

import custom_exceptions.PenHandlingException;

import com.app.core.Color;
import com.app.core.InkColor;
import com.app.core.Material;

public class PenValidation {
	public static Color parseAndValidateColor(String col) {
		return Color.valueOf(col.toUpperCase());
	}

	public static InkColor parseAndValidateInkColor(String icol) {
		return InkColor.valueOf(icol.toUpperCase());
	}

	public static Material parseAndValidateMaterial(String mat) {
		return Material.valueOf(mat.toUpperCase());
	}

	public static Pens validateAllInputs(int id, String brand, String color, String icol, String mat, String ldate,
			Double price, List<Pens> pens) throws PenHandlingException {
		Color c = parseAndValidateColor(color);
		InkColor i = parseAndValidateInkColor(icol);
		Material m = parseAndValidateMaterial(mat);
		LocalDate date = LocalDate.parse(ldate);
		return new Pens(brand, c, i, m, date, price);

	}
}
