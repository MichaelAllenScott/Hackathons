import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { ActivatedRoute, Router } from '@angular/router';

/*
 The point of this service is to abstract all of the common service functionality
 out of the individual services so that we do not duplicate our service code across
 the endpoints.  Each endpoint will have its own service file to control the individual aspects of each service.
 */

@Injectable()
export class ApiGeneral {
  rawHeaders: any = {
    'Content-Type': 'application/json',
    'Accept': 'application/json'
  };

  headers: HttpHeaders = new HttpHeaders(this.rawHeaders);

  endpointBaseUrl = 'http://localhost:4200/api/';

  constructor(private http: HttpClient, ) { }

  getPatients(doctorId: string) {
    return this.get(`patients?drId=${doctorId}`);
  }

  get(path: string): Observable<any> {
    return this.http.get(`${this.endpointBaseUrl}${path}`, { headers: this.headers });
  }
}
