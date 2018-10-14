package org.eclipse.paho.client.mqttv3.util;

import java.util.Hashtable;
import java.util.Enumeration;

public class Properties extends Hashtable {
	Enumeration propertyNames() {
		return keys();
	}
}
