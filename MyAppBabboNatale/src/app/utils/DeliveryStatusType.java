package app.utils;

public enum DeliveryStatusType {
	delivered{
		public String toString() {
			return "consegnato";
		}
	},
	notDelivered{
		public String toString() {
			return "non consegnato";
		}
	};
}
