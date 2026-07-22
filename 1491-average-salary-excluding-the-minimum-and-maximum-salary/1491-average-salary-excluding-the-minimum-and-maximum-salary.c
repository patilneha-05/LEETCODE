double average(int* salary, int salarySize) {
    int minSalary = salary[0], maxSalary = salary[0];
    int sum = 0;

    for (int i = 0; i < salarySize; i++) {
        if (salary[i] < minSalary) {
            minSalary = salary[i];
        }
        if (salary[i] > maxSalary) {
            maxSalary = salary[i];
        }
        sum += salary[i];
    }
    sum -= (minSalary + maxSalary);
    return (double)sum / (salarySize - 2);
}
