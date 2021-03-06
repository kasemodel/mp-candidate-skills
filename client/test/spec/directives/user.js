'use strict';

describe('Directive: user', function () {

  // load the directive's module
  beforeEach(module('clientApp'));

  var scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
    scope.user = {
      'name':'Jonas',
      'email':'jonas@gmail.com'
    };
  }));

  it('should receive user', inject(function () {
    expect(scope.user).toBeDefined();
  }));

});
