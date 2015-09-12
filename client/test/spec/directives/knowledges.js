'use strict';

describe('Directive: knowledges', function () {

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

  it('should created a knowledges element', inject(function ($compile) {
    var element = angular.element('<knowledges></knowledges>');
    element = $compile(element)(scope);
    expect(element.length).toBe(1);
  }));
});
