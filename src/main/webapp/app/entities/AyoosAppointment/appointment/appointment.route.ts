import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { JhiPaginationUtil, JhiResolvePagingParams } from 'ng-jhipster';
import { UserRouteAccessService } from 'app/core';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { Appointment } from 'app/shared/model/AyoosAppointment/appointment.model';
import { AppointmentService } from './appointment.service';
import { AppointmentComponent } from './appointment.component';
import { AppointmentDetailComponent } from './appointment-detail.component';
import { AppointmentUpdateComponent } from './appointment-update.component';
import { AppointmentDeletePopupComponent } from './appointment-delete-dialog.component';
import { IAppointment } from 'app/shared/model/AyoosAppointment/appointment.model';

@Injectable({ providedIn: 'root' })
export class AppointmentResolve implements Resolve<IAppointment> {
  constructor(private service: AppointmentService) {}

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<Appointment> {
    const id = route.params['id'] ? route.params['id'] : null;
    if (id) {
      return this.service.find(id).pipe(
        filter((response: HttpResponse<Appointment>) => response.ok),
        map((appointment: HttpResponse<Appointment>) => appointment.body)
      );
    }
    return of(new Appointment());
  }
}

export const appointmentRoute: Routes = [
  {
    path: 'appointment',
    component: AppointmentComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: ['ROLE_USER'],
      defaultSort: 'id,asc',
      pageTitle: 'ayoosAppointmentApp.ayoosAppointmentAppointment.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'appointment/:id/view',
    component: AppointmentDetailComponent,
    resolve: {
      appointment: AppointmentResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'ayoosAppointmentApp.ayoosAppointmentAppointment.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'appointment/new',
    component: AppointmentUpdateComponent,
    resolve: {
      appointment: AppointmentResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'ayoosAppointmentApp.ayoosAppointmentAppointment.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'appointment/:id/edit',
    component: AppointmentUpdateComponent,
    resolve: {
      appointment: AppointmentResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'ayoosAppointmentApp.ayoosAppointmentAppointment.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];

export const appointmentPopupRoute: Routes = [
  {
    path: 'appointment/:id/delete',
    component: AppointmentDeletePopupComponent,
    resolve: {
      appointment: AppointmentResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'ayoosAppointmentApp.ayoosAppointmentAppointment.home.title'
    },
    canActivate: [UserRouteAccessService],
    outlet: 'popup'
  }
];
