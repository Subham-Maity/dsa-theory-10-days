class Solution {
public:
    bool canChange(string start, string target) {
        int mains = 0;
        int numb1 = 0, numbs1 = 0, numb2 = 0, numbs2 = 0;
        for(auto j : start) { 
            if(j == 'L') numb1++;
            else if(j == 'R') numbs1++;
        }
        for(auto j : target) { 
            if(j == 'L') numb2++;
            else if(j == 'R') numbs2++;
        }
        if(numb1 == numb2  && numbs1 == numbs2){ 
            vector<int> first;
            vector<int> second;
            for(int j = 0;j<start.size();j++){ 
                if(start[j] != '_') first.push_back(j);
            }
            for(int j = 0;j<start.size();j++){ 
                if(target[j] != '_') second.push_back(j);
            }
            bool f = 1;
            for(int j = 0;j<first.size();j++){ 
                if(start[first[j]] != target[second[j]]){ f = 0;}
                else { 
                    if(start[first[j]] == 'L'){ 
                        if(first[j] < second[j]) f = 0;
                        
                    }else { 
                        if(first[j] > second[j]) f = 0;
                        
                    }
                }

            }
            if(f) return true;
            return false;
        }
        return false;
    }
};