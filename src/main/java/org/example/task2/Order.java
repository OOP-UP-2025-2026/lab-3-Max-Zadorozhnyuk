package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.setId(id);
        this.setCustomer(customer);
    }

    public void setId(long id) {
        if (id <= 0) throw new IllegalArgumentException("ID замовлення має бути більше 0");
        this.id = id;
    }

    public void setCustomer(String customer) {
        if (customer == null || customer.isEmpty())
            throw new IllegalArgumentException("Ім’я клієнта не може бути порожнім");
        this.customer = customer;
    }

    public long getId() {
        return this.id;
    }

    public String getCustomer() {
        return this.customer;
    }

    public String formOrderBill(Cart cart) {
        if (cart == null || cart.getItemCount() == 0) {
            return "Кошик порожній. Замовлення не створене.";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(this.id)
                .append(" for customer ").append(this.customer)
                .append("\n------------------\n");

        double sum = 0.0;

        for (Item item : cart.getContents()) {
            sum += item.getPrice();
            builder.append("Item id: ").append(item.getId())
                    .append(" name: ").append(item.getName())
                    .append(" price: ").append(item.getPrice())
                    .append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ").append(sum).append(" грн");

        return builder.toString();
    }
}