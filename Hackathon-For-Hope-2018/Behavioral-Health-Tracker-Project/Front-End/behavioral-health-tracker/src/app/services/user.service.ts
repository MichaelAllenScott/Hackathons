import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';

@Injectable()
export class UserService {
    private userName = 'Michael Scott';
    private userType = 'doctor';
    private userLoggedIn$: BehaviorSubject<boolean> = new BehaviorSubject(true);

    constructor () { }

    setUserName(userName: string): void {
        this.userName = userName;
    }

    setUserType(userType: string): void {
        this.userType = userType;
    }

    setUserLoggedIn(userLoggedIn: boolean) {
        this.userLoggedIn$.next(userLoggedIn);
    }

    getUserType(): string {
        return this.userType;
    }

    getUserName(): string {
        return this.userName;
    }

    getUserLoggedIn$(): BehaviorSubject<boolean> {
        return this.userLoggedIn$;
    }

    logUserOut() {
        this.userLoggedIn$.next(false);
    }
}
