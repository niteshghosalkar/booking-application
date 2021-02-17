package com.smarteinc.assignment.booking;

import java.util.HashMap;
import java.util.Map;

public enum TypeEnum {

	BUS(1) {
		@Override
		public BookingStrategy createObject() {
			return new BookBus();
		}
	},
	CAR(2) {
		@Override
		public BookingStrategy createObject() {
			return new BookCar();
		}
	};

	private int value;

	TypeEnum(int value) {
		this.value = value;
	}

	private static final Map<Integer, TypeEnum> BY_LABEL = new HashMap<>();

	static {
		for (TypeEnum e : values()) {
			BY_LABEL.put(e.value, e);
		}
	}

	public static TypeEnum valueOfLabel(int label) {

		if (BY_LABEL.containsKey(label)) {
			return BY_LABEL.get(label);
		} else {
			throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
		}

	}

	public abstract BookingStrategy createObject();
}
