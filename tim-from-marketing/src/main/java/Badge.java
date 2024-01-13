class Badge {
    public String print(Integer id, String name, String department) {

    StringBuilder stringBuilder = new StringBuilder();
    String result = null;

    if (id == null && department == null) {
            stringBuilder.append(name)
                    .append(" - ")
                    .append("OWNER");

            result = stringBuilder.toString();
        }
    else if (id == null) {
        stringBuilder.append(name)
                .append(" - ")
                .append(department.toUpperCase());

        result = stringBuilder.toString();
    }
    else if (department == null) {
        stringBuilder.append("[")
                .append(id)
                .append("]")
                .append(" - ")
                .append(name)
                .append(" - ")
                .append("OWNER");

        result = stringBuilder.toString();
    }
    else {
        stringBuilder.append("[")
                .append(id)
                .append("]")
                .append(" - ")
                .append(name)
                .append(" - ")
                .append(department.toUpperCase());

        result = stringBuilder.toString();
        }

    return result;
    }
}
