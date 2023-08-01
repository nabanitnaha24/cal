int r = 0;
        for (int i = 1; i < n; i++) {
            // checking if r th person knows i th person
            if (arr[r][i] == 1) {
                arr[r][r] = 1;
                r = i;
            }
            else {
                arr[i][i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            // checking if i th person can be a celebrity or
            // not
            if (arr[i][i] == 0) {
                int flag = 0;
                // iterating in the i th coluarrn to check
                // whether everyone knows i th person or not
                for (int j = 0; j < n; j++) {
                    // checking if arr[j][i] is not a diagonal
                    // elearrent and if j th person knows i th
                    // person
                    if (j != i && arr[j][i] == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    return i;
            }
        }
        return -1;