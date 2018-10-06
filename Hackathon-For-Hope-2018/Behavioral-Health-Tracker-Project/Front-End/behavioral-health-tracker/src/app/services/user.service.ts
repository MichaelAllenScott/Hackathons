import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';

@Injectable()
export class UserService {
    private userName = '';
    private userType = '';
    private userLoggedIn$: BehaviorSubject<boolean> = new BehaviorSubject(false);
    private userId: string;

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

    setUserId(userId: string) {
        this.userId = userId;
    }

    getUserType(): string {
        return this.userType;
    }

    getUserName(): string {
        return this.userName;
    }

    getUserId(): string {
        return this.userId;
    }

    getUserLoggedIn$(): BehaviorSubject<boolean> {
        return this.userLoggedIn$;
    }

    logUserOut() {
        this.userLoggedIn$.next(false);
    }
}
